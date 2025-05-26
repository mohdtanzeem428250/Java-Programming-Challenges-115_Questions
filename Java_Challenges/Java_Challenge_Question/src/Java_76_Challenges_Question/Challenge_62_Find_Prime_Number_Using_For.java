package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_62_Find_Prime_Number_Using_For
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Prime Or Not Number");
		System.out.print("Please, Enter The Number Find Prime : ");
		int number=scanner.nextInt();
		boolean isPrime=isFindPrimeNumber(number);
		System.out.println("Your Number Is : "+(isPrime?"Prime Number":"Not Prime Number"));
	}
	public static boolean isFindPrimeNumber(int number)
	{
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
}