package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_20_Age_Calculator 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To Age Calculator...");
		System.out.println("Please, Enter Your Age : ");
		int age=scanner.nextInt();
		if(age>=60)
		{
			System.out.println("You Are A Senior Citizen");
		}
		else if(age>=20)
		{
			System.out.println("You Are An Adult");
		}
		else if(age>=13)
		{
			System.out.println("You Are A Teenager");
		}
		else
		{
			System.out.println("you Are A Child");
		}
		scanner.close();
	}
}
