package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_10_Perimeter_Rectangle 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To Perimeter Calculator");
		System.out.println("Please, Enter All 4 Sides In CM...");
		double left=scanner.nextDouble();
		double right=scanner.nextDouble();
		double top=scanner.nextDouble();
		double buttom=scanner.nextDouble();
		double perimeter=left+right+top+buttom;
		System.out.println("Perimeter Of Your Rectangle Is : "+perimeter+" CM");
		scanner.close();
		
	}
}
