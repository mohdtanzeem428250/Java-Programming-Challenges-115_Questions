package Multithreading;

public class ThirdThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.printf("%d$ ",i);
		}
		System.out.println("3 Task Complete");
	}
}
