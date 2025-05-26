package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_65_Exit_Of_Exit_Using_Break 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Exit Of Exit");
		while(true)
		{
			System.out.print("Please, Enter Your Commands : ");
			String commands=scanner.next();
			if(commands.equalsIgnoreCase("Exit"))
			{
				break;
			}
		}
		System.out.println("You Have Successfully Exited...");
	}
}
