package Challenge_104_Multiple_Thread_Executors;
public class SleepTasks implements Runnable
{
	@Override
	public void run()
	{
		Thread current=Thread.currentThread();
		System.out.printf("Started Thread IS : %s\n",current.getName());
		try 
		{
			Thread.sleep(getRandomNumber()*1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.printf("Ended Thread IS : %s\n",current.getName());
	}
	public int getRandomNumber()
	{
		double random= (Math.random()*5+1);
		return (int)random;
	}
}
