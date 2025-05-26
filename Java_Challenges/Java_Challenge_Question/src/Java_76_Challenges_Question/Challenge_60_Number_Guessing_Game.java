package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_60_Number_Guessing_Game 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=6,guess;
		System.out.println("Welcome To The Number Guessing Game");
		do
		{
			System.out.print("Please, Enter Guess The Number Between 0 & 10 : ");
			guess=scanner.nextInt();
		}while(number!=guess);
		System.out.print("You Have Successfully Guessed The Number");
	}
}
