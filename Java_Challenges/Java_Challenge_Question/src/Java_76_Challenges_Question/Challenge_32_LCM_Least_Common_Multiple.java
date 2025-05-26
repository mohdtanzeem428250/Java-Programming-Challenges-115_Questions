package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_32_LCM_Least_Common_Multiple 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To LCM (Least Common Multiple)");
		System.out.print("Please, Enter Your First Number : ");
		int firstNumber=scanner.nextInt();
		System.out.print("Please, Enter Your Second Number : ");
		int secondNumber=scanner.nextInt();
		int finalLCM=lcmLeastCommonMultiple(firstNumber,secondNumber);
		System.out.println("LCM Of The Two number Is : "+finalLCM);
		scanner.close();
	}
	public static int lcmLeastCommonMultiple(int firstNumber,int secondNumber)
	{
//		Example :- 15,20
		int i=1;
		while(true)
		{
			int factor=firstNumber*i;		//15*4=60
			if(factor%secondNumber==0)		//60%20==0
			{
				return factor;				//Actual Result 60
			}
			i+=1;
		}
	}
}
