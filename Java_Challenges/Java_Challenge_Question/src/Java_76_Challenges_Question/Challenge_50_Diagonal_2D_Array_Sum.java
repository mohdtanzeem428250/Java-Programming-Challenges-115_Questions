package Java_76_Challenges_Question;

public class Challenge_50_Diagonal_2D_Array_Sum 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Diagonal 2D Array Sum");
		int[][] myArray=Challenge_40_Array_Utility.input2DArray();
		long sum=sumOfDiagonals(myArray);
		System.out.println("Sum Of 2D Array Diagonal Sum : "+sum);
	}
	public static long sumOfDiagonals(int[][] myArray)
	{
		long leftSum=sumOfLeftDiagonal(myArray);
		long rightSum=sumOfRightDiagonal(myArray);
		long sum=leftSum+rightSum;
		if(myArray.length%2!=0)
		{
			int ind=myArray.length/2;
			sum-=myArray[ind][ind];
		}
		return sum;
	}
	public static long sumOfLeftDiagonal(int[][] myArray)
	{
		long sum=0;
		int i=0;
		while(i<myArray.length)
		{
			sum+=myArray[i][i];
			i++;
		}
		return sum;
	}
	public static long sumOfRightDiagonal(int[][] myArray)
	{
		long sum=0;
		int i=0;
		while(i<myArray.length)
		{
			int col=myArray.length-1-i;
			sum+=myArray[i][col];
			i++;
		}
		return sum;
	}
}
