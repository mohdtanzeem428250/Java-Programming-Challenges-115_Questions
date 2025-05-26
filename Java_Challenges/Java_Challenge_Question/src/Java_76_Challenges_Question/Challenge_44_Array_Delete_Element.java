package Java_76_Challenges_Question;
import java.util.Scanner;
public class Challenge_44_Array_Delete_Element 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Array Deletion Elements");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		System.out.print("Now Enter The Number You Want To Deleted : ");
		int delete=scanner.nextInt();
		int[] newArray=deleteElement(myArray,delete);
		System.out.println("Here Is Your New Array");
		int i=0;
		while(i<newArray.length)
		{
			System.out.print(newArray[i]+" ");
			i++;
		}
	}
	public static int[] deleteElement(int[] myArray,int delete)
	{
		int occu=Challenge_41_Array_Number_Occurrences.isFoundElement(myArray, delete);
		if(occu==0)
		{
			return myArray;
		}
		int newSize=myArray.length-occu;
		int[] newArray=new int[newSize];
		
		
		int i=0,j=0;
		while(i<myArray.length)
		{
			if(myArray[i]!=delete)
			{
				newArray[j]=myArray[i];
				j++;
			}
			i++;
		}
		
		
		return newArray;
	}
}
