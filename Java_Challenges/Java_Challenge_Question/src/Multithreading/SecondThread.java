package Multithreading;

public class SecondThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.printf("%d# ",i);
		}
		System.out.println("2 Task Complete");
	}
}
