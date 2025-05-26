package Java_76_Challenges_Question;

public class Challenge_52_Course_Enrolled 
{
	static int maxCapacity=100;
	String courseName;
	int enrolledStudent;
	Challenge_52_Course_Enrolled(String courseName)
	{
		this.courseName=courseName;
		this.enrolledStudent=0;
	}
	String[] enrollStudent=new String[maxCapacity];
	static void setMaxCapacity(int maxCapacity)
	{
		Challenge_52_Course_Enrolled.maxCapacity=maxCapacity;
	}
	void enrollStudent(String studentName)
	{
		enrollStudent[enrolledStudent]=studentName;
		enrolledStudent++;
	}
	void unrolledStudent(String studentName)
	{
		System.out.println("Student Removed");
		enrolledStudent--;
	}
}
