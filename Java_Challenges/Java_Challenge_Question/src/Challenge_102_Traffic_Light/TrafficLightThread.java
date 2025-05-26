package Challenge_102_Traffic_Light;

public class TrafficLightThread extends Thread
{
	private final TrafficColor color;

	public TrafficLightThread(TrafficColor color)
	{
		this.color=color;
	}
	@Override
	public void run()
	{
		System.out.printf("%s Active\n",color);
		try
		{
			Thread.sleep(color.getOnTimeInMillis());
		}
		catch(InterruptedException exception)
		{
			throw new RuntimeException(exception);
		}
		System.out.printf("%s InActive\n",color);
	}
}
