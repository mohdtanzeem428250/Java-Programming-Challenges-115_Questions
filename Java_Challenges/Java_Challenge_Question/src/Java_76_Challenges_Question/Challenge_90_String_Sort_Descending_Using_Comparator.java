package Java_76_Challenges_Question;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Challenge_90_String_Sort_Descending_Using_Comparator
{
	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("Tanzeem","Rahul","Areeb","Isha","Mahak","Sohail","Khushi");
		stringDescendingOrder(list);
	}
	public static void stringDescendingOrder(List<String> strItems)
	{
		Collections.sort(strItems,new Comparator<String>() 
		{
			@Override
			public int compare(String s,String t1)
			{
				if(s.equals(t1))
				{
					return 0;
				}
				else if(s.charAt(0)<t1.charAt(0))
				{
					return -1;
				}
				else
				{
					return 1;
				}
			}
		});
	}
}
