package Java_76_Challenges_Question;

public class Challenge_89_Variable_Argument 
{
	public static void main(String[] args)
	{
		concatenateString("Hello");
		concatenateString("Hello","How","Are","You");
		concatenateString("Best","Java","Challenges");
	}
	public static void concatenateString(String... str)
	{
		StringBuilder stringBuilder=new StringBuilder();
		for(String strItems:str)
		{
			stringBuilder.append(strItems).append(" ");
		}
		System.out.println(stringBuilder);
	}
}
