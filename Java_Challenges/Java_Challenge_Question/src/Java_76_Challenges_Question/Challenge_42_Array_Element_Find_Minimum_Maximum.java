package Java_76_Challenges_Question;

public class Challenge_42_Array_Element_Find_Minimum_Maximum 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Find Minimum Maximum Element In The Array");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		int max=maximum(myArray);
		int min=minimum(myArray);
		System.out.println("Maximum Of The Array Is : "+max);
		System.out.println("Minimum Of The Array Is : "+min);
	}
	public static int maximum(int[] myArray)
	{
		if(myArray.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int max=myArray[0];
		int i=0;
		while(i<myArray.length)
		{
			if(max<myArray[i])
			{
				max=myArray[i];
			}
			i++;
		}
		return max;
	}
	public static int minimum(int[] myArray)
	{
		int min=Integer.MAX_VALUE;
		int i=0;
		while(i<myArray.length)
		{
			if(min>myArray[i])
			{
				min=myArray[i];
			}
			i++;
		}
		return min;
	}
}
