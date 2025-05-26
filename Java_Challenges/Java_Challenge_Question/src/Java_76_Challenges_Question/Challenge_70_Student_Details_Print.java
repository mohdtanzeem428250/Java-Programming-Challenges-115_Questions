package Java_76_Challenges_Question;

public class Challenge_70_Student_Details_Print 
{
	String name;
	int age;
	int marks;
	String class1;
	
	Challenge_70_Student_Details_Print(String name,int age,int marks,String class1)
	{
		this.name=name;
		this.age=age;
		this.marks=marks;
		this.class1=class1;
	}
	@Override
	public String toString()
	{
		return "Student Details=[Name : "+name+", Age : "+age+", Marks : "+marks+", Class : "+class1+"]";
	}
	public static void main(String[] args)
	{
		Challenge_70_Student_Details_Print object=new Challenge_70_Student_Details_Print("Tanzeem",21,78,"BCA");
		System.out.println(object);
	}
}
