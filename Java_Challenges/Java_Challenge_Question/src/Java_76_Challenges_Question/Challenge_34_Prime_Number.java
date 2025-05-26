package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_34_Prime_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Find Prime Number Checker");
		System.out.print("Please, Enter The Number : ");
		int prime=scanner.nextInt();
		boolean bool=isPrimeNumber(prime);
		if(bool)
		{
			System.out.println("Your Number Is Prime");
		}
		else
		{
			System.out.println("Your Number Is Not Prime");
		}
		scanner.close();
	}
	public static boolean isPrimeNumber(int primeNumber)
	{
		int i=2;
		while(i<primeNumber)
		{
			if(primeNumber%i==0)//   39%7==0
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
