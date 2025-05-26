package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_5_Name_Of_Input 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Your Name : ");
		String name=scanner.nextLine();
		System.out.println("Welcome : "+name+" To Coding Seekho Aur Seekhao");
		scanner.close();
	}
}
