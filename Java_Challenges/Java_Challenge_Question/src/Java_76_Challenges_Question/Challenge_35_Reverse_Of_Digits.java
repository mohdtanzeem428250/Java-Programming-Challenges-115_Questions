package Java_76_Challenges_Question;

import java.util.Scanner;

public class Challenge_35_Reverse_Of_Digits 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Sum Of Digits Number");
		System.out.println("Please, Enter The Number : ");
		int number=scanner.nextInt();
		int finalResult=reverseOfDigits(number);
		System.out.println("Reverse Of Digit Is : "+finalResult);
		scanner.close();
	}
	public static int reverseOfDigits(int number)
	{
		int newNumber=0;
		while(number>0)
		{
			int digit=(number%10);
			newNumber=newNumber*10+digit;
			number=number/10;
		}
		return newNumber;
	}
}
