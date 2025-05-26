package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_39_Loop_Patterns 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("We Are Here To Print Patterns");
		System.out.print("Please, Enter The Number Of Rows : ");
		int rows=scanner.nextInt();
		rightHalfPyramid(rows);
		reverseRightHalfPyramid(rows);
		rightAlignedTriangle(rows);
		scanner.close();
	}
	public static void rightHalfPyramid(int rows)
	{
		System.out.println("Right Half Pyramid");
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void reverseRightHalfPyramid(int rows)
	{
		System.out.println("Reverse Rigth Half Pyramid");
		for(int i=rows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void rightAlignedTriangle(int rows)
	{
		System.out.println("Right Aligned Triangle");
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
