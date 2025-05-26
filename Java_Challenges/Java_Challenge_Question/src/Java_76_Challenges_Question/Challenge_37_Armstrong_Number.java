package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_37_Armstrong_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Armstrong Number");
		System.out.print("Please, Enter The Number : ");
		int number=scanner.nextInt();
		boolean value=isArmstrong(number);
		if(value)
		{
			System.out.println("Your Number Is Armstrong");
		}
		else
		{
			System.out.println("Your Number Is Not Armstrong");
		}
		scanner.close();
	}
	public static boolean isArmstrong(int number)
	{
		int digit=numberOfDigit(number);
		int newCopy=number;
		int finalNumber=0;
		while(number>0) 
		{
			int digits=number%10;
			number/=10;
			finalNumber=powerCalculate(digits,digit);
		}
		return finalNumber==newCopy;
	}
	public static int powerCalculate(int number1,int number2)
	{
		int result=number1;
		int i=0;
		while(i<number2)
		{
			result*=number1;
			i++;
		}
		return result;
	}
	public static int numberOfDigit(int num1)
	{
		int digit=0;
		while(num1>0)
		{
			digit++;
			num1/=10;
		}
		return digit;
	}
}
