package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_68_Fibonacci_Series_Using_Recursion 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Priting Fibonacci Series Printed");
		System.out.print("Enter The Number Of Elements To Be Printed : ");
		int count=scanner.nextInt();
		for(int i=1;i<=count;i++)
		{
			System.out.print(fibonacciSeries(i)+", ");
		}
	}
	public static int fibonacciSeries(int position)
	{
		if(position==1)
		{
			return 0;
		}
		if(position==2)
		{
			return 1;
		}
		return fibonacciSeries(position-1)+fibonacciSeries(position-2);
	}
}
