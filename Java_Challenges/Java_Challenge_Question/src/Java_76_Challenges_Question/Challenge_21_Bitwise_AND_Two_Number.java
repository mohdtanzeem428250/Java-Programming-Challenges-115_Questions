package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_21_Bitwise_AND_Two_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Showcasing Bitwise AND Operator");
		System.out.print("Please, Enter The First Number : ");
		int firstNumber=scanner.nextInt();
		System.out.print("Now, Enter The Second Number : ");
		int secondNumber=scanner.nextInt();
		int result=firstNumber&secondNumber;
		System.out.println("Result Is : "+result);
		scanner.close();
	}
}
