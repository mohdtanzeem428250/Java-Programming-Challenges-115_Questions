package Java_76_Challenges_Question;

import java.util.Scanner;

public class Challenge_13_Compound_Interest 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To Compound Interest Calculator");
		System.out.println("Please, Enter Your Principal Amount Rs/-");
		double principal=scanner.nextDouble();
		System.out.println("Now, Tell Me Your Rate Of Interest");
		double time=scanner.nextDouble();
		System.out.println("Now, Tell Me For How Many Years Are You Borrowing This Money : ");
		double rate=scanner.nextDouble();
		double compoundInterest=principal*Math.pow(1+rate/100,time);
		System.out.println("Your Compound Interest Is Rs/- "+compoundInterest);
		scanner.close();
	}
}
