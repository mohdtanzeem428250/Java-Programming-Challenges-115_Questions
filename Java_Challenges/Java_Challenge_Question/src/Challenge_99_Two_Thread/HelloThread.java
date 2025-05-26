package Challenge_99_Two_Thread;

public class HelloThread extends Thread
{
	private final int threadNumber;
	public HelloThread(int threadNumber)
	{
		this.threadNumber=threadNumber;
	}
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.printf("(%d) %s Hello From Thread : %d\n",i,Thread.currentThread().getName(),threadNumber);
		}
	}
}
