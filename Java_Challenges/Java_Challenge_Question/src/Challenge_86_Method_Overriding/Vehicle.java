package Challenge_86_Method_Overriding;

public class Vehicle 
{
	public void service()
	{
		System.out.println("Vehicle Service Method Called");
	}
}
class Car extends Vehicle
{
	public void service()
	{
		super.service();
		System.out.println("Car Service Method Called");
	}
}