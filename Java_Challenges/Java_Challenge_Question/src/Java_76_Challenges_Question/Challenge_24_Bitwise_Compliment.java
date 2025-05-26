package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_24_Bitwise_Compliment 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Showcase Of Not/Compliment Operator");
		System.out.print("Please, Enter The Number");
		int number=scanner.nextInt();
		int result=~number;
		System.out.println("Your Result Is : "+result);
		scanner.close();
	}
}
