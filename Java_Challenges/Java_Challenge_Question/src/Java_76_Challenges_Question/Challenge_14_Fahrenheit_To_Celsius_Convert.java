package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_14_Fahrenheit_To_Celsius_Convert 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To Temperature Converter Calculator");
		System.out.println("Please, Enter Your Temperature In Fahrenheit");
		float fahrenheit=scanner.nextFloat();
		float celsius=(fahrenheit-32)*5/9;
		System.out.println("Your Temperature Is :- "+celsius+" C");
		scanner.close();
	}
}
