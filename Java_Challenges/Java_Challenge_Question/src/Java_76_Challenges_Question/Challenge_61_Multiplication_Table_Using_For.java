package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_61_Multiplication_Table_Using_For 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Multiplication Table");
		System.out.println("Please, Enter The Any Number : ");
		int number=scanner.nextInt();
		printMultiplicationTable(number);
		scanner.close();
	}
	public static void printMultiplicationTable(int number)
	{
		System.out.println("Multiplication Table... "+number);
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+" x "+i+" = "+number*i);
		}
	}
}