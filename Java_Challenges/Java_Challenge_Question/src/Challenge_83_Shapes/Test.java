package Challenge_83_Shapes;

public class Test 
{
	public static void main(String[] args)
	{
		Circle circle=new Circle(5);
		Square square=new Square(10.3);
		System.out.printf("Area Of Circle Is %f\n",circle.calculateArea());
		System.out.printf("Area Of Square Is %f",square.calculateArea());
	}
}
