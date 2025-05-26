package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_18_Leap_Year 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To New Year Calculator");
		System.out.println("Please, Enter The Year That You Want To Check : ");
		int year=scanner.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0))
		{
			System.out.println("Your Year Is a Leap Year");
		}
		else
		{
			System.out.println("Your Year Is Not A Leap Year");
		}
		scanner.close();
	}
}
