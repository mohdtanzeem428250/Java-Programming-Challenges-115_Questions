package Java_76_Challenges_Question;
public class Challenge_40_Array_Sum_And_Average 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Array Sum And Average");
		int[] myArray=Challenge_40_Array_Utility.inputArray();
		int sum=sumArray(myArray);
		float average=averageArray(sum,myArray);
		System.out.println("Sum Of The Number Is : "+sum);
		System.out.println("Average Of The Number Is : "+average);
	}
	public static int sumArray(int[] myArray)
	{
		int i=0;
		int sum=0;
		while(i<=myArray.length-1)
		{
			sum=sum+myArray[i];
			i++;
		}
		return sum;
	}
	public static float averageArray(int sum,int[] myArray)
	{
		int average=sum/myArray.length;
		return average;
	}
}
