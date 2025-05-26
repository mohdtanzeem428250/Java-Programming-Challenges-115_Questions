package ExecutorsService;

public class PrintTasksExecutor implements Runnable
{
	private final char targetChar;
	public PrintTasksExecutor(char targetChar)
	{
		this.targetChar=targetChar;
	}
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			try
			{
				Thread.sleep(50);
			} 
			catch (InterruptedException e) 
			{
				throw new RuntimeException(e);
			}
			System.out.printf("%d %s",i,targetChar);
		}
		System.out.printf("%s %c Task Complete",Thread.currentThread().getName(),targetChar);
	}
}
