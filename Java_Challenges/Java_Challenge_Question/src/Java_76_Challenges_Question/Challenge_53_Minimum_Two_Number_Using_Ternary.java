package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_53_Minimum_Two_Number_Using_Ternary 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Minimum Number");
		System.out.print("Please Enter First Number : ");
		int firstNumber=scanner.nextInt();
		System.out.print("Please Enter Second Number : ");
		int secondNumber=scanner.nextInt();
		Challenge_53_Minimum_Two_Number_Using_Ternary object=new Challenge_53_Minimum_Two_Number_Using_Ternary();
		int minNumber=object.minimumNumber(firstNumber,secondNumber);
		System.out.println("Minimum Number : "+minNumber);
	}
	public int minimumNumber(int firstNumber,int secondNumber)
	{
		int minimumNumber=firstNumber<secondNumber?firstNumber:secondNumber;
		return minimumNumber;
	}
}
