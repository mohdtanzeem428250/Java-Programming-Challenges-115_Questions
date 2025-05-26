package Multithreading;

public class FirstThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.printf("%d@ ",i);
		}
		System.out.println("1 Task Complete");
	}
}
