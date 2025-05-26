package Java_76_Challenges_Question;
import java.util.Comparator;
import java.util.PriorityQueue;
class Student
{
	private final String name;
	private final char grade;
	
	Student(String name,char grade)
	{
		this.name=name;
		this.grade=grade;
	}
	public String getName()
	{
		return name;
	}
	public char getGrade()
	{
		return grade;
	}
	@Override
	public String toString()
	{
		return"[Name : "+name+", Grade : "+grade+"]";
	}
}
public class Challenge_94_Priority_Queue 
{
	public static void main(String[] args)
	{
		PriorityQueue<Student> queue=new PriorityQueue<>(new Comparator<Student>() 
		{
			@Override
			public int compare(Student student,Student t1)
			{
				return student.getGrade()-t1.getGrade();
			}
		});
		queue.offer(new Student("Tanzeem",'A'));
		queue.offer(new Student("Sohail",'C'));
		queue.offer(new Student("Rahul",'E'));
		queue.offer(new Student("Sohan",'D'));
		queue.offer(new Student("Jain",'B'));
		queue.offer(new Student("Amit",'F'));
		System.out.println("Queue Is : "+queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
