package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_36_Find_Fibonacci_Series 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Fibonacci Series");
		System.out.print("Please, Enter The Number Upto Which Series Has To Be Printed : ");
		int number=scanner.nextInt();
		System.out.println("Here Is The Fibonacci Series...");
		findFibonacciSeries(number);
		scanner.close();
	}
	public static void findFibonacciSeries(int number)
	{
		if(number<0)return;
		System.out.print("0, ");
		if(number==0)return;
		System.out.print("1, ");
		int number1=0;
		int number2=1;
		while(number1+number2<=number)
		{
			int number3=number1+number2;
			System.out.print(number3+", ");
			number1=number2;
			number2=number3;
		}
		
	}
}
