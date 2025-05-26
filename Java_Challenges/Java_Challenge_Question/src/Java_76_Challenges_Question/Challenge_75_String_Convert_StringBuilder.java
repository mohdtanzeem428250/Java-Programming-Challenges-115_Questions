package Java_76_Challenges_Question;

public class Challenge_75_String_Convert_StringBuilder 
{
	public static void main(String[] args)
	{
		String[] str=new String[] {"Success","is","not","the","result",
				"of","luck","but","is","consistent","hardwork","and","determination"};
		StringBuilder myString=new StringBuilder();
		for(String stringItems:str)
		{
			myString.append(stringItems).append(" ");	
		}
		System.out.print(myString); 
	}
}
