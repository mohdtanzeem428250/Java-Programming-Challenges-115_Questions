package Challenge_102_Traffic_Light;

public enum TrafficColor 
{
	RED(10000),YELLOW(4000),GREEN(8000);
	
	private final int onTimeInMillis;
	
	public int getOnTimeInMillis()
	{
		return onTimeInMillis;
	}
	
	TrafficColor(int onTimeInMillis)
	{
		this.onTimeInMillis=onTimeInMillis;
	}
}
