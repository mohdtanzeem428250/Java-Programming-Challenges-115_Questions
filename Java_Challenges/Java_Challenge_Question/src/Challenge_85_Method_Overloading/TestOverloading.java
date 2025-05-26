package Challenge_85_Method_Overloading;

public class TestOverloading 
{
	public static void main(String[] args)
	{
		Calculater object=new Calculater();
		System.out.println(object.add(2,3));
		System.out.println(object.add(4,5,6));
		System.out.println(object.add(5.6,4.8));
	}
}
