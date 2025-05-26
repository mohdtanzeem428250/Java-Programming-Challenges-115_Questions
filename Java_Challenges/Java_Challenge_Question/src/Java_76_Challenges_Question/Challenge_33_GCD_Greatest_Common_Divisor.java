package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_33_GCD_Greatest_Common_Divisor 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To GCD Greatest Common Divisor");
		System.out.print("Please, Enter Your Number : ");
		int firstNumber=scanner.nextInt();		//15
		System.out.println("Now, Enter Your Number");
		int secondNumber=scanner.nextInt();		//20
		int finalResult=greatestCommonDivisor(firstNumber,secondNumber);
		System.out.println("GCD Of The Number Is : "+finalResult);
		scanner.close();
	}
	public static int greatestCommonDivisor(int firstNumber,int secondNumber)
	{
		//15, 20
		int gcd=1;
		int i=2;
		int lessNumber=leastNumber(firstNumber,secondNumber);//15
		while(i<=lessNumber)
		{
			if(firstNumber%i==0 && secondNumber%i==0)//15%15==0 T 20%5==0
			{
				System.out.println(i);
				gcd=i;
			}
			i++;
		}
		return gcd;
	}
	public static int leastNumber(int num1,int num2)
	{
		//15, 20
		if(num1<num2)
		{
			return num1;//15 return
		}
		else
		{
			return num2;			
		}
	}
}
