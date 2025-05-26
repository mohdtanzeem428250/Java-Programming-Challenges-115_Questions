package Challenge_97_Enum_WeekDay_WeekEnd;

public enum Days 
{
	SUNDAY(false),
	MONDAY(true),
	TUESDAY(true),
	WEDNESDAY(true),
	THURADAY(true),
	FRIDAY(true),
	SATURDAY(false);
	
	private final boolean isWeekDayAndWeekEnd;
	Days(boolean isWeekDayAndWeekEnd)
	{
		this.isWeekDayAndWeekEnd=isWeekDayAndWeekEnd;
	}
	public String getType()
	{
		return isWeekDayAndWeekEnd?"WeekDay":"WeekEnd";
	}
}
