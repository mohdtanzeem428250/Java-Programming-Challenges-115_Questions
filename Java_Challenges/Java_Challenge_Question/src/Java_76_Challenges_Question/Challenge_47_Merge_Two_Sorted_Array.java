package Java_76_Challenges_Question;

public class Challenge_47_Merge_Two_Sorted_Array 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Merge Sorted Array");
		int[] myArray1=Challenge_40_Array_Utility.inputArray();
		int[] myArray2=Challenge_40_Array_Utility.inputArray();
		int[] newMergeArray=mergeArray(myArray1,myArray2);
		System.out.println("Your Merged Array Is : ");
		Challenge_40_Array_Utility.displayArray(newMergeArray);
	}
	public static int[] mergeArray(int[] myArray1,int[] myArray2)
	{
		int newSize=myArray1.length+myArray2.length;
		int[] newArray=new int[newSize];
		int i=0,j=0,k=0;
		while(i<myArray1.length || j<myArray2.length)
		{
			if(j==myArray2.length || (i<myArray1.length && myArray1[i]<myArray2[j]))
			{
				newArray[k]=myArray1[i];
				i++;
				k++;
			}
			else
			{
				newArray[k]=myArray2[j];
				k++;
				j++;
			}
		}
		return newArray;
	}
}
