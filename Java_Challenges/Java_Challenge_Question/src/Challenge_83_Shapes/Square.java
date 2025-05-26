package Challenge_83_Shapes;

public class Square extends Shape
{
	
	private double sideInCM;
	
	public Square(double sideInCM)
	{
		this.sideInCM=sideInCM;
	}
	public double getSideInCM() {
		return sideInCM;
	}
	public void setSideInCM(double sideInCM) {
		this.sideInCM = sideInCM;
	}
	@Override
	public double calculateArea()
	{
		return Math.pow(sideInCM,2);
	}
}
