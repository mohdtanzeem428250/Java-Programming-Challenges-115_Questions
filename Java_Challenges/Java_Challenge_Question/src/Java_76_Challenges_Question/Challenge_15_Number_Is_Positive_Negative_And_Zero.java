package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_15_Number_Is_Positive_Negative_And_Zero 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Any Number...");
		int number=scanner.nextInt();
		if(number>0)
		{
			System.out.println("Number Is Positive...");
		}
		else if(number==0)
		{
			System.out.println("Number Is Zero, Try Again...");
		}
		else
		{
			System.out.println("Number Is Negative...");
		}
		scanner.close();
	}
}
