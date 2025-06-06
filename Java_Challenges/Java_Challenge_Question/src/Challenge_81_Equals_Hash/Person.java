package Challenge_81_Equals_Hash;
import java.util.Objects;
public class Person 
{
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
//	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
		{
			return false;
		}
		Person per=(Person) obj;
		return per.name.equals(name) && per.age==age;
	}
	
	public int hashCode()
	{
		return Objects.hash(name,age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
