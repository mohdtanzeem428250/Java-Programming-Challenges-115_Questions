package com.application;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.simple.JSONArray;
public class WeatherApplication 
{
	public static JSONObject getWeatherData(String locationName)
	{
		JSONArray locationData=getLocationData(locationName);
		JSONObject location=(JSONObject) locationData.get(0);
		double latitude=(double) location.get("latitude");
		double longitude=(double) location.get("longitude");
		String url="https://api.open-meteo.com/v1/forecast?"+
				"latitude="+latitude+"&longitude="+longitude+
				"&hourly=temperature_2m,relativehumidity_2m,weathercode,windspeed_10m&timezone=America%2FLos_Angeles";
		try
		{
			HttpURLConnection connection=fetchApiResponse(url);
			if(connection.getResponseCode()!=200)
			{
				System.out.println("Error: Could Not Connect To API");
				return null;
			}
			StringBuilder resultJson=new StringBuilder();
			Scanner scanner=new Scanner(connection.getInputStream());
			while(scanner.hasNext())
			{
				resultJson.append(scanner.nextLine());
			}
			scanner.close();
			connection.disconnect();
			JSONParser parser=new JSONParser();
			JSONObject resultJsonObject=(JSONObject) parser.parse(String.valueOf(resultJson));
			
			JSONObject hourly=(JSONObject) resultJsonObject.get("hourly");
			JSONArray time=(JSONArray) hourly.get("time");
			int index=findIndexOfCurrentTime(time);
			
			JSONArray temperatureData=(JSONArray) hourly.get("temperature_2m");
			double temperature=(double) temperatureData.get(index);
			
			JSONArray weathercode=(JSONArray) hourly.get("weathercode");
			String weathercondition=convertWeatherCode((long) weathercode.get(index));
			
			JSONArray relativeHumidity=(JSONArray) hourly.get("relativehumidity_2m");
			long humidity=(long) relativeHumidity.get(index);
			
			JSONArray windspeedData=(JSONArray) hourly.get("windspeed_10m");
			double windspeed=(double) windspeedData.get(index);
			
			JSONObject weatherData=new JSONObject();
			weatherData.put("temperature", temperature);
			weatherData.put("weather_condition", weathercondition);
			weatherData.put("humidity", humidity);
			weatherData.put("windspeed", windspeed);
			return weatherData;
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return null;
	}
	public static JSONArray getLocationData(String locationName)
	{
		locationName=locationName.replaceAll(" ","+");
		String url="https://geocoding-api.open-meteo.com/v1/search?name="+
				locationName+"&count=10&language=en&format=json";
		try
		{
			HttpURLConnection connection=fetchApiResponse(url);
			
			if(connection.getResponseCode()!=200)
			{
				System.out.println("Error: Could Not Connect To API ");
				return null;
			}
			else
			{
				StringBuilder resultJson=new StringBuilder();
				Scanner scanner=new Scanner(connection.getInputStream());
				while(scanner.hasNext())
				{
					resultJson.append(scanner.nextLine());
				}
				scanner.close();
				connection.disconnect();
				JSONParser parser=new JSONParser();
				JSONObject resultJsonObject=(JSONObject) parser.parse(String.valueOf(resultJson));
				JSONArray locationData=(JSONArray) resultJsonObject.get("results");
				return locationData;
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return null;
	}
	private static HttpURLConnection fetchApiResponse(String urlString)
	{
		try
		{
			URL url=new URL(urlString);
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			return connection;
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
		}
		return null;
	}
	private static int findIndexOfCurrentTime(JSONArray timeList)
	{
		String currentTime=getCurrentTime();
		for(int i=0;i<timeList.size();i++)
		{
			String time=(String) timeList.get(i);
			if(time.equalsIgnoreCase(currentTime))
			{
				return i;
			}
		}
		return 0;
	}
	public static String getCurrentTime()
	{
		LocalDateTime currentDateTime=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH':00'");
		String formattedDateTime=currentDateTime.format(formatter);
		return formattedDateTime;
	}
	private static String convertWeatherCode(long weathercode)
	{
		String weatherCondition="";
		if(weathercode==0L)
		{
			weatherCondition="Clear";
		}
		else if(weathercode >= 0L && weathercode <= 3L)
		{
			weatherCondition="Cloudy";
		}
		else if((weathercode >= 51L && weathercode <= 67L) || weathercode >= 80L && weathercode <= 99L)
		{
			weatherCondition="Rain";
		}
		else if(weathercode >= 71L && weathercode <= 77L)
		{
			weatherCondition="Snow";
		}
		return weatherCondition;	
	}
}
