package Java_Another_Question;
import java.util.ArrayList;
public class ArraysList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Integer> list3=new ArrayList<Integer>();
		for(int i=10;i<=100;i+=10)
		{
			list1.add(i);
			list2.add(i);
		}
		if(list1.size()==list2.size())
		{
			for(int i=0;i<=list1.size()-1;i++)
			{
				list3.add(list1.get(i)+list2.get(i));
			}
			System.out.println("List 3 : "+list3);
		}
		else
		{
			System.out.println("Please Array List And Array List Two Size Are Not Equlas");
		}
	}
}
