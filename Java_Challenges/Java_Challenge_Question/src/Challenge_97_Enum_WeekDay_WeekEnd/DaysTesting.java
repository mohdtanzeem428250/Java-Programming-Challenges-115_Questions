package Challenge_97_Enum_WeekDay_WeekEnd;

public class DaysTesting 
{
	public static void main(String[] args)
	{
		System.out.println("Printing All The Days Of The Week");
		for(Days days:Days.values())
		{
			System.out.printf("%s : %s\n",days,days.getType());
		}
	}
}
