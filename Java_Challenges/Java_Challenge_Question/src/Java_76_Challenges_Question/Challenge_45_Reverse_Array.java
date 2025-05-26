package Java_76_Challenges_Question;

public class Challenge_45_Reverse_Array
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Array Reversal");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		reverseArray(myArray);
		System.out.println("Your Reversed Array Is");
		Challenge_40_Array_Utility.displayArray(myArray);
	}
	public static void reverseArray(int[] myArray)
	{
		int i=0;
		while(i<myArray.length/2)
		{
			int swap=myArray[i];
			myArray[i]=myArray[(myArray.length-1)-i];
			myArray[(myArray.length-1)-i]=swap;
			i++;
		}
	}
}
