package Java_76_Challenges_Question;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Challenge_98_Country_Mapped 
{
	public static void main(String[] args)
	{
		Map<String,String> mapped=new HashMap<>();
		mapped.put("India","New Delhi");
		mapped.put("China","Beijing");
		mapped.put("Pakistan","Islamabad");
		mapped.put("SriLanka","Columbo");
		mapped.put("Bangladesh","Dhaka");
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please Enter The Country Name : ");
		String country=scanner.next();
		if(mapped.containsKey(country))
		{
			System.out.printf("Capital Of %s is %s",country,mapped.get(country));
		}
		else
		{
			System.out.printf("Sorry We don't Know The Capital");
		}
	}
}
