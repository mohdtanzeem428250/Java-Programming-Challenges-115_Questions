package Challenge_100_Thread_State;

public class ThreadTesting
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadStates t1=new ThreadStates();
		ThreadStates t2=new ThreadStates();
		System.out.printf("Create The Thread %s \n",t1.getState());
		System.out.printf("Create The Thread %s \n",t2.getState());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.printf("Thread Finished %s \n",t1.getState());
		System.out.printf("Thread Finished %s \n",t2.getState());
	}
}
