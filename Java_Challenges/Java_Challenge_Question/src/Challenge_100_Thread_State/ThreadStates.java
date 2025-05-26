package Challenge_100_Thread_State;
import java.util.Scanner;
public class ThreadStates extends Thread
{
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(4000);
			Scanner scanner=new Scanner(System.in);
			int i=scanner.nextInt();
			System.out.printf("From Inside Run %s \n",getState());
		}
		catch(InterruptedException exception)
		{
			throw new RuntimeException(exception);
		}
	}
}
