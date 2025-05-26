package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_29_Sum_All_Odd_Number 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Odd Number");
		System.out.println("Please, Enter The Number : ");
		int n=scanner.nextInt();
		int finalResult=sumAllOddNumber(n);
		System.out.println("All Odd Number Sum : "+finalResult);
		scanner.close();
	}
	public static int sumAllOddNumber(int n)
	{
		int sum=0;
		System.out.println("All Odd Number");
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		return sum;
	}
}
