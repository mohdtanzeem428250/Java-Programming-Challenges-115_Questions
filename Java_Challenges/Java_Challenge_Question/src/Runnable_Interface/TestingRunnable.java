package Runnable_Interface;

public class TestingRunnable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		long startTime=System.currentTimeMillis();
		PrintTasks p1=new PrintTasks('@');
		PrintTasks p2=new PrintTasks('#');
		PrintTasks p3=new PrintTasks('%');
		
		Thread t1=new Thread(p1);
//		t1.setPriority(Thread.MIN_PRIORITY);
		Thread t2=new Thread(p2);
//		t2.setPriority(Thread.NORM_PRIORITY);
		Thread t3=new Thread(p3);
//		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		System.out.println("\n Thread 1 Started");
		t2.start();
		System.out.println("\n Thread 2 Started");
		t1.join();
		t3.start();
		System.out.println("\n Thread 3 Started");
		long endTime=System.currentTimeMillis();
		System.out.printf("%s Total Time Taken : %d ",Thread.currentThread().getName(),(startTime-endTime));
	}
}
