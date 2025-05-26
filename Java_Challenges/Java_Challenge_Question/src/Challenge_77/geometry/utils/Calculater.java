package Challenge_77.geometry.utils;

import Challenge_77.geometry.Circle;
import Challenge_77.geometry.Rectangle;

public class Calculater 
{
	public static void main(String[] args)
	{
		Circle circle=new Circle(5.5);
		Rectangle rectangle=new Rectangle(10,5);
		
		double circleArea=Math.pow(circle.radius, 2);
		double rectangleArea=(rectangle.length*rectangle.breadth);
		
		System.out.printf("Area Of The Circle Is : %f, Area Of The Rectangle Is : %f",circleArea,rectangleArea);
	}
}
