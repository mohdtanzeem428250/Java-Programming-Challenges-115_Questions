package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_64_Number_Of_Occurrences_Array_Using_ForEach
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Finding The Array Occurrences");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		System.out.print("Please, Enter The Number You Want To Search : ");
		int element=scanner.nextInt();
		System.out.println("Number Of Occurrences Is AN Array : "+findOccurrences(myArray,element));
	}
	public static int findOccurrences(int[] array,int element)
	{
		int occurrences=0;
		for(int occu:array)
		{
			if(occu==element)
			{
				occurrences++;
			}
		}
		return occurrences;
	}
}
