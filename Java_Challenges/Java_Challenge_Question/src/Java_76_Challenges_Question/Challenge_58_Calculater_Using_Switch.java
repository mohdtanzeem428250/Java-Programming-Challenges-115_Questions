package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_58_Calculater_Using_Switch 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Calculater Using Switch");
		System.out.print("Please, Enter The First Number : ");
		int firstNumber=scanner.nextInt();
		System.out.print("Now, Enter The Second Number : ");
		int secondNumber=scanner.nextInt();
		System.out.print("Finally, Select The Operations This -> ( + , - , * , / , % ) : ");
		String operation=scanner.next();
		int result=switch(operation)
		{
			case"+" -> firstNumber+secondNumber;
			case"-" -> firstNumber-secondNumber;
			case"*" -> firstNumber*secondNumber;
			case"/" -> firstNumber/secondNumber;
			case"%" -> firstNumber%secondNumber;
			default -> -1;
		};
		System.out.println("Your Answer Is : "+result);
	}
}
