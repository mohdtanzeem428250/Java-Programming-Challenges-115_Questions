package Java_76_Challenges_Question;
import java.util.Arrays;
import java.util.List;
public class Challenge_92_List_Swapping 
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(2,3,4,5,6,7,8);
		System.out.println(list);
		swapList(list,2,5);
		System.out.println(list);
	}
	public static void swapList(List<Integer> listInt,int x,int y)
	{
		int swap=listInt.get(x);
		listInt.set(x,listInt.get(y));
		listInt.set(y,swap);
	}
}
