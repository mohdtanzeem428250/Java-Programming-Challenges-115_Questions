package Challenge_82_Nested_Class;

public class TestArray 
{
	public static void main(String[] args)
	{
		ArrayOperations operation=new ArrayOperations(new int[] {1,2,3,4,5});
		ArrayOperations.Statistics sta=operation.new Statistics();
		System.out.println(sta.mean());
	}
}
