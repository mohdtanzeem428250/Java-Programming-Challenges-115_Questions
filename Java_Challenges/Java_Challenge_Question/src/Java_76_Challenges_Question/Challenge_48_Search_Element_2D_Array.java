package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_48_Search_Element_2D_Array 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Serach In 2 Dimensional Array");
		int[][] myArray=Challenge_40_Array_Utility.input2DArray();
		System.out.print("Now, Enter The Number You Want To Search : ");
		int search=scanner.nextInt();
		boolean isExist=searchArray(myArray,search);
		if(isExist)
		{
			System.out.println("Element Is Exist");
		}
		else
		{
			System.out.println("Element Is Not Exist");
		}
	}
	public static boolean searchArray(int[][] myArray,int search)
	{
		int i=0;
		while(i<myArray.length)
		{
			int j=0;
			while(j<myArray.length)
			{
				if(myArray[i][j]==search)
				{
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
	}
}
