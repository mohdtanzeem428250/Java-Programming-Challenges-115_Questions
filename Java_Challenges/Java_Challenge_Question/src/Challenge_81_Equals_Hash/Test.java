package Challenge_81_Equals_Hash;

public class Test 
{
	public static void main(String[] args)
	{
		Person p1=new Person("Tanzeem",21);
		Person p2=new Person("Tanzeem",21);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		if(p1.equals(p2))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equals");
		}
	}
}
