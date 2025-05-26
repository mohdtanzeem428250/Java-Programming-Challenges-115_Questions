package Java_76_Challenges_Question;

public class Challenge_63_Maximum_Value_Array_Using_ForEach
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Finding The Maximum");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		System.out.println("Maximum Value In An Array : "+maximumValue(myArray));
	}
	public static int maximumValue(int[] array)
	{
		int max1=Integer.MIN_VALUE;
		for(int max:array)
		{
			if(max1<max)
			{
				max1=max;
			}
		}
		return max1;
	}
}
