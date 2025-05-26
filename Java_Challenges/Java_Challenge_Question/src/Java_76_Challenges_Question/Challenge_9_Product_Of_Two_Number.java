package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_9_Product_Of_Two_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("We Are Doing Float Multiplication");
		System.out.println("Please, Enter The First Decimal Number");
		double firstNumber=scanner.nextDouble();
		System.out.println("Now, Enter The Second Decimal Number");
		double secondNumber=scanner.nextDouble();
		System.out.println("Product Result : "+(firstNumber*secondNumber));
		scanner.close();
		
	}
}
