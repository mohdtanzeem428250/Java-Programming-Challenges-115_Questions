package Java_76_Challenges_Question;

import java.util.Scanner;

public class Challenge_54_Find_Even_Odd_Using_Ternary 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Even Odd Number");
		System.out.print("Please Enter Your Any Number : ");
		int firstNumber=scanner.nextInt();
		Challenge_54_Find_Even_Odd_Using_Ternary object1=new Challenge_54_Find_Even_Odd_Using_Ternary();
		String find=object1.findEvenOdd(firstNumber);
		System.out.println(find);
	}
	String findEvenOdd(int firstNumber)
	{
		return firstNumber%2==0?"Your Number Is Even":"Your Number Is Odd";
	}
}
