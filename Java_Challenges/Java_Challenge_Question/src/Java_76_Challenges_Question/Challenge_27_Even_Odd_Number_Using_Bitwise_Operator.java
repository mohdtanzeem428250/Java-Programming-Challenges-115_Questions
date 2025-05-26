package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_27_Even_Odd_Number_Using_Bitwise_Operator 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("This is a Even/Odd Calculater Using Bitwise Operator");
		System.out.print("Please, Enter The Any Number : ");
		int number=scanner.nextInt();
		if((number&1)==1)
		{
			System.out.println("This Number Is A Odd : "+number);
		}
		else
		{
			System.out.println("This Number Is A Even : "+number);
		}
		scanner.close();
	}
}
