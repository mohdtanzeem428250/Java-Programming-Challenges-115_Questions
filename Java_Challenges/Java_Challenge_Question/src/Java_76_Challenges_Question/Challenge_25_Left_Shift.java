package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_25_Left_Shift 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Showcase Left Shift Operator");
		System.out.print("Please, Enter The Number : ");
		int firstNumber=scanner.nextInt();
		int result=firstNumber<<1;
		System.out.println("Your Result Is : "+result);
		scanner.close();
	}
}
