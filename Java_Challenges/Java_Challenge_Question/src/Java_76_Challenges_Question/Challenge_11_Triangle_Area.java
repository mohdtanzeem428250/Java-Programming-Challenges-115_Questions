package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_11_Triangle_Area 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome, To Area Calculator");
		System.out.println("Please, Enter Your Base in CMS : ");
		double base=scanner.nextDouble();
		System.out.println("Now, Enter Your Prependicular Height In CMS");
		double height=scanner.nextDouble();
		double area=(base*height)/2;
		System.out.println("The Area Of Rectangle Is : "+area+" CMS2");
		scanner.close();
	}
}
