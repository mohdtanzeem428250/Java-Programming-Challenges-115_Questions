package Challenge_101_Thread_Using_Join;

public class PrintThreeThread extends Thread
{
	private final int threadNumber;
	
	public PrintThreeThread(int threadNumber)
	{
		this.threadNumber=threadNumber;
	}
	
	@Override
	public void run()
	{
		System.out.printf("%s Thread Is Started-%d\n",Thread.currentThread().getName(),threadNumber);
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException exception)
		{
			throw new RuntimeException(exception);
		}
		System.out.printf("%s Thread Is Ending-%d\n",Thread.currentThread().getName(),threadNumber);
	}
}
