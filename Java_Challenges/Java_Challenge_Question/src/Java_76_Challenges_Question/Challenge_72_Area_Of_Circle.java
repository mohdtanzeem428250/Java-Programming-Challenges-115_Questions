package Java_76_Challenges_Question;

import java.util.Scanner;

public class Challenge_72_Area_Of_Circle 
{
	double radiusInMm;
	Challenge_72_Area_Of_Circle(double radiusInMm)
	{
		this.radiusInMm=radiusInMm;
	}
	double getCircumference()
	{
		return 2*radiusInMm*Math.PI;
	}
	double getAreaRadius()
	{
		return Math.PI*Math.pow(radiusInMm,2);
	}
	@Override
	public String toString()
	{
		return "Circle Properties=[Radius In MM : "+radiusInMm+", Circumference In MM : "+getCircumference()+", Area In MM2 : "+getAreaRadius()+"]";
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To The World Of Circle");
		System.out.print("Please, Enter The Radius : ");
		double radius=scanner.nextDouble();
		Challenge_72_Area_Of_Circle object=new Challenge_72_Area_Of_Circle(radius);
		System.out.println(object);
	}
}
