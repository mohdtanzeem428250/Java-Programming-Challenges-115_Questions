package Challenge_103_Single_Thread_Executors;

public class PrintNumber implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.printf("Number Is : %d\n",i);
		}
	}
}
