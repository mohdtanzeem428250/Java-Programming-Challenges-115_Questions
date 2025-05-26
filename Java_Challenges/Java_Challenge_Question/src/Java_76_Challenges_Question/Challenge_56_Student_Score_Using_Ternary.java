package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_56_Student_Score_Using_Ternary 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Student Score");
		System.out.print("Please, Enter Your Marks");
		int marks=scanner.nextInt();
		String category=marks>80?"High Score":(marks>=50 && marks<80?"Moderate Score":(marks<50)?"Low Score":"");
		System.out.println("Your Category Is : "+category);
	}
}
