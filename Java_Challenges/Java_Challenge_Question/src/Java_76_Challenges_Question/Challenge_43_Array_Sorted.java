package Java_76_Challenges_Question;

public class Challenge_43_Array_Sorted
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Array Sorting Check Post");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		boolean isInc=isIncreasing(myArray);
		boolean isDec=isDecreasing(myArray);
		if(isInc||isDec)
		{
			System.out.println("Your Array Is Sorted");
		}
		else
		{
			System.out.println("Your Array Is Not Sorted");
		}
	}
	public static boolean isIncreasing(int[] myArray)
	{
		int i=1;//11,2,3,4,5,6,7,8
		while(i<myArray.length)
		{
			if(myArray[i]<myArray[i-1])//2<11
			{
				return false;
			}
			i++;
		}
		return true;
	}
	public static boolean isDecreasing(int[] myArray)
	{
		int i=1;//23,12,4,3,2,1
		while(i<myArray.length)
		{
			if(myArray[i]>myArray[i-1])//12>23
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
