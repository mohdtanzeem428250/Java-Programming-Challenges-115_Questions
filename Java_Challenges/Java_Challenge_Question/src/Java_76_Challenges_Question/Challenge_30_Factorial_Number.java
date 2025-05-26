package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_30_Factorial_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Factorial Number Calculater");
		System.out.println("Please, Enter Any Number");
		int factorial=scanner.nextInt();
		long finalResult=factorialNumber(factorial);
		System.out.println("Factorial Number Is : "+finalResult);
		scanner.close();
	}
	public static long factorialNumber(int fact)
	{
		if(fact<2)
		{
			return 1;
		}
		int i=1;
		long factorial=1;
		while(i<=fact)
		{
			factorial=factorial*i;
			i++;
		}
		return factorial;
	}
}
