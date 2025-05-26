package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_16_Find_Even_Odd 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To Even Odd Calculator...");
		System.out.println("Please Entre The Any Number...");
		int evenOdd=scanner.nextInt();
		if(evenOdd%2==0)
		{
			System.out.println("Your Number Is An Even Number "+evenOdd);
		}
		else
		{
			System.out.println("Your Number Is An Odd Number "+evenOdd);
		}
		scanner.close();
	}
}
