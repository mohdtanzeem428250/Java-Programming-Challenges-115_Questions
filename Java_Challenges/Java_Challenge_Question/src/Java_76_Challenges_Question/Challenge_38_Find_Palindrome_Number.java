package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_38_Find_Palindrome_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Palindrome Number");
		System.out.println("Please, Enter Your Number : ");
		int number=scanner.nextInt();
		boolean value=isPalindrome(number);
		if(value)
		{
			System.out.println(value+" Number Is A Palindrome");
		}
		else
		{
			System.out.println(value+" Number Is A Not Palindrome");
		}
		scanner.close();
	}
	public static boolean isPalindrome(int number)
	{
		int original=number;
		int reversed=0;
		while(number!=0)
		{
			int digit=number%10;
			reversed=reversed*10+digit;
			number/=10;
		}
		return reversed==original;
	}
}
