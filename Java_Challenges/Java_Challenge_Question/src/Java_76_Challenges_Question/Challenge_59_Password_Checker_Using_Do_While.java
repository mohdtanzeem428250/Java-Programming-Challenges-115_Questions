package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_59_Password_Checker_Using_Do_While 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To set Password Checker");
		String password;
		do
		{
			System.out.print("Please, Enter your Password : ");
			password=scanner.next();
		}while(isValidPassword(password));
		System.out.print("Thanks, For Entering A Valid Password");
	}
	public static boolean isValidPassword(String password)
	{
		if(password.length()>=6)
		{
			return false;
		}
		return true;
	}
}
