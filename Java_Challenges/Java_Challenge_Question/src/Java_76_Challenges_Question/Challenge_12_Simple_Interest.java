package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_12_Simple_Interest 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To Simple Interest Calculator");
		System.out.println("Please, Enter Your Principal Amount Rs/-");
		double principal=scanner.nextDouble();
		System.out.println("Now, Tell Me Your Rate Of Interest");
		double time=scanner.nextDouble();
		System.out.println("Now, Tell Me For How Many Years Are You Borrowing This Money : ");
		double rate=scanner.nextDouble();
		double area=(principal*time*rate)/100;
		System.out.println("Simple Interest Rs/- : "+area);
		scanner.close();
	}
}
