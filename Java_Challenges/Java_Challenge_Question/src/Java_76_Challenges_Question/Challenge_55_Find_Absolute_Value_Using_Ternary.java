package Java_76_Challenges_Question;

import java.util.Scanner;
public class Challenge_55_Find_Absolute_Value_Using_Ternary
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Absolute value");
		System.out.println("Please Enter The Any Number");
		int value=scanner.nextInt();
		int result=value>=0?value:-value;
		System.out.println("Absolute Value Is : "+result);
	}
}