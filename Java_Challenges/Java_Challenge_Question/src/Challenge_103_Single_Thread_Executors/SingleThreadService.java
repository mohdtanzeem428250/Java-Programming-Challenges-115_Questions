package Challenge_103_Single_Thread_Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class SingleThreadService 
{
	public static void main(String[] args) 
	{
		try(ExecutorService service=Executors.newSingleThreadExecutor())
		{
			PrintNumber task1=new PrintNumber();
			service.submit(task1);
		}
	}
}
