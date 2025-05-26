package Java_76_Challenges_Question;

import java.util.Scanner;

public class Challenge_40_Array_Utility 
{
	public static int[] inputArray()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please, Enter The Number Of An Array size : ");
		int size=scanner.nextInt();
		int[] array=new int[size];
		int i=0;
		while(i<array.length)
		{
			System.out.print("Please, Enter Element Number ("+(i+1)+") : ");
			array[i]=scanner.nextInt();
			i++;
		}
//		scanner.close();
		return array;
	}
	public static int[][] input2DArray()
	{
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Please, Enter The Number Of Rows : ");
		int rows=scanner1.nextInt();
		System.out.println("Please, Enter The Number Of Columns : ");
		int columns=scanner1.nextInt();
		int[][] array=new int[rows][columns];
		int i=0;
		while(i<=rows-1)
		{
			int j=0;
			while(j<=columns-1)
			{
				System.out.print("Please, Enter Element Row : ("+(i+1)+") And Columns : ("+(j+1)+") : ");
				array[i][j]=scanner1.nextInt();
				j++;
			}
			i++;
		}
//		scanner.close();
		return array;
	}
	public static int[] displayArray(int[] myArray)
	{
		int i=0;
		while(i<myArray.length)
		{
			System.out.print(myArray[i]+" ");
			i++;
		}
		return myArray;
	}
}
