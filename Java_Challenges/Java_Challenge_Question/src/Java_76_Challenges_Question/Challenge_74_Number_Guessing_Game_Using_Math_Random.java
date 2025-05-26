package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_74_Number_Guessing_Game_Using_Math_Random 
{
	public static void main(String[] args)
	{
		int random=isRandomNumber();
		System.out.println("Welcome To Number Guessing Game");
		while(true)
		{
			int guess=inputByUser();
			if(random==guess)
			{
				break;
			}
			else if(guess<random)
			{
				System.out.println("Please Guess Higher");
			}
			else if(guess>random)
			{
				System.out.println("Please Guess Lower");
			}
		}
		System.out.println("You Have Successfully Guessed The Number");
	}
	public static int isRandomNumber()
	{
		double random=Math.random()*100;
		int find= (int)Math.round(Math.ceil(random));
		return find;
	}
	public static int inputByUser()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please, Enter Guess The Number Between 1 & 100 : ");
		int guess=scanner.nextInt();
		return guess;
	}
}
