package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_31_Sum_Of_Digits 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Sum Of Digits Number");
		System.out.println("Please, Enter The Number");
		int number=scanner.nextInt();
		int finalResult=sumOfDigits(number);
		System.out.println("Sum Of Digit Is : "+finalResult);
		scanner.close();
	}
	public static int sumOfDigits(int number)
	{
		int sum=0;
		while(number>0)
		{
			sum=sum+(number%10);
			number=number/10;
		}
		return sum;
	}
}
