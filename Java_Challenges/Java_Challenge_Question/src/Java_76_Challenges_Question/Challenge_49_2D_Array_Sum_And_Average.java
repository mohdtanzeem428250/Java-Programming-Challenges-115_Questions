package Java_76_Challenges_Question;

public class Challenge_49_2D_Array_Sum_And_Average 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To 2D Array Sum And Average");
		int[][] myArrays=Challenge_40_Array_Utility.input2DArray();
		int sum=sumArray(myArrays);
		double average=averageArray(myArrays);
		System.out.println("Sum Of The Number Is : "+sum);
		System.out.println("Average Of The Number Is : "+average);
	}
	public static int sumArray(int[][] myArray)
	{
		int i=0,sum=0;
		while(i<myArray.length)
		{
			int j=0;
			while(j<myArray.length)
			{
				sum=sum+myArray[i][j];
				j++;
			}
			i++;
		}
		return sum;
	}
	public static double averageArray(int[][] myArray)
	{
		if(myArray.length==0)
		{
			return 0;
		}
		int rows=myArray.length;
		int columns=myArray[0].length;
		double size=rows*columns;
		return sumArray(myArray)/size;
	}
}
