package Java_76_Challenges_Question;
public class Challenge_7_Swap_Two_Number 
{
	public static void main(String[] args)
	{
		int first=10;
		int second=20;
//		int temp;
		
		System.out.println("Before.....");
		System.out.println("First Number : "+first);
		System.out.println("Second Number : "+second);
		
//		temp=first;
//		first=second;
//		second=temp;
		
		first=first+second;
		second=first-second;
		first=first-second;
		
		
		System.out.println("After.....");
		System.out.println("First Number : "+first);
		System.out.println("Second Number : "+second);
		
	}
}
