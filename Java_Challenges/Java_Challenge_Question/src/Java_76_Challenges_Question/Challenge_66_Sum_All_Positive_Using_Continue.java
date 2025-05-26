package Java_76_Challenges_Question;

public class Challenge_66_Sum_All_Positive_Using_Continue
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Adding Positive Number");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		int sumResult=sumPositiveNumber(myArray);
		System.out.println("The Sum Of Positive Number Is : "+sumResult);
	}
	public static int sumPositiveNumber(int[] array)
	{
		int sum=0;
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]<0)
			{
				continue;
			}
			sum += array[i];
		}
		return sum;
	}
}
