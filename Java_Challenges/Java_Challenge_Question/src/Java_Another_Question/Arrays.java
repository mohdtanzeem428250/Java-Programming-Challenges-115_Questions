package Java_Another_Question;

public class Arrays 
{
	public static void main(String[] args)
	{
		int[] array1={1,2,3,4,5,6};
		int[] array2={1,2,3,4,5,6};
		if(array1.length==array2.length)
		{
			int[] array3=new int[array1.length];
			for(int i=0;i<=array3.length-1;i++)
			{
				array3[i]=array1[i]+array2[i];
				System.out.print(array3[i]+", ");
			}
		}
		else
		{
			System.out.println("Please Array1 And Array2 Size Are Not Equals");
		}
	}
}
