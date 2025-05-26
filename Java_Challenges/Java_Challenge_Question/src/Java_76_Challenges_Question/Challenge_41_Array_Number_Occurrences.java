package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_41_Array_Number_Occurrences 
{
	public static void main(String[] args)
	{
		int find1=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome To Array Occurrences");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		System.out.print("Now Enter The Number You Want To Find : ");
		find1=input.nextInt();
		int occurrencesElement=isFoundElement(myArray,find1);
		System.out.println("Your Element Was Found "+occurrencesElement+" Times In The Array");
//		input.close();
	}
	public static int isFoundElement(int[] myArray,int find)
	{
		int occurrence=0;
		int i=0;
		while(i<=myArray.length-1)
		{
			if(myArray[i]==find)
			{
				occurrence++;
			}
			i++;
		}
		return occurrence;
	}
}
