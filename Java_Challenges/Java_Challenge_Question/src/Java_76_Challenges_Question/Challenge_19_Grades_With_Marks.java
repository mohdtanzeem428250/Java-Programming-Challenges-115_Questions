package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_19_Grades_With_Marks 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To The Grade Calculator...");
		System.out.println("Please, Enter Your Percentage...");
		float percentage=scanner.nextFloat();
		if(percentage>=90)
		{
			System.out.println("Great, You Have Got A");
		}
		else if(percentage>=75)
		{
			System.out.println("Good, You Have Got B");
		}
		else if(percentage>=60)
		{
			System.out.println("You Have Got C, Work Harder Next Time");
		}
		else if(percentage>=30)
		{
			System.out.println("You Have Got D, You Seriously Need To Work Harder");
		}
		else
		{
			System.out.println("Sorry, You Have Failed The Test And Got a F");
		}
		scanner.close();
	}
}
