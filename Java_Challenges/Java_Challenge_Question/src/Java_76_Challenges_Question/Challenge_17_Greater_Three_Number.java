package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_17_Greater_Three_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To The World Of Three");
		System.out.println("Please, Enter Your First Number : ");
		int firstNumber=scanner.nextInt();
		System.out.println("Now, Enter Your Second Number : ");
		int secondNumber=scanner.nextInt();
		System.out.println("Finally, Enter Your Third Number : ");
		int thirdNumber=scanner.nextInt();
		if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
		{
			System.out.println(firstNumber+" Is The Greater Number...");
		}
		else if(secondNumber>=thirdNumber && secondNumber>=firstNumber)
		{
			System.out.println(secondNumber+" Is The Greater Number...");
		}
		else
		{
			System.out.println(thirdNumber+" Is The Greater Number...");
		}
		scanner.close();
	}
}
