package Challenge_87_Try_Catch;
import java.util.Scanner;
public class Calculater_Try_Catch 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Calculater");
		while(true)
		{
			System.out.print("Please, Enter The First Number : ");
			int firstNumber=scanner.nextInt();
			System.out.print("Now, Enter The Second Number : ");
			int secondNumber=scanner.nextInt();
			{
				try
				{
					int result=firstNumber/secondNumber;
					System.out.println("Result Is : "+result);
					break;
				}
				catch(ArithmeticException exception)
				{
					if(exception.getMessage().equals("/ by zero"))
					{
						System.out.println("Divide By Zero Occurred...");
					}
					else
					{
						throw exception;
					}
				}
			}
		}
	}
}
