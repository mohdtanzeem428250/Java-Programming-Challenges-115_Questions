package Java_76_Challenges_Question;

public class Challenge_67_Print_Only_Even_Number_Using_Continue
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Print Only Even Numbers");
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			System.out.print(i+", ");
		}
	}
}
