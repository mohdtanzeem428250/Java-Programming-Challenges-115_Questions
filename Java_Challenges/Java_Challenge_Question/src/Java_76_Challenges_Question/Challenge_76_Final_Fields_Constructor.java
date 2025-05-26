package Java_76_Challenges_Question;

public class Challenge_76_Final_Fields_Constructor 
{
	final int noOfWheels;
	final String model;
	final String engineInLiters;
	
	Challenge_76_Final_Fields_Constructor(int noOfWheels,String model,String engineInLiters)
	{
		this.noOfWheels=noOfWheels;
		this.model=model;
		this.engineInLiters=engineInLiters;
	}
	public static void main(String[] args)
	{
		Challenge_76_Final_Fields_Constructor object=new Challenge_76_Final_Fields_Constructor(4,"WSD2025","10");
		System.out.println("Number Of Wheels : "+object.noOfWheels);
		System.out.println("Model : "+object.model);
		System.out.println("Engine In Liters : "+object.engineInLiters);;
	}
}