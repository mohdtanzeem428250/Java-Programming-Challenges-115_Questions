package Challenge_83_Shapes;

public class Circle extends Shape
{
	private double radiusInCM;
	
	public Circle(double radiusInCM)
	{
		this.radiusInCM=radiusInCM;
	}

	public double getRadiusInCM() {
		return radiusInCM;
	}

	public void setRadiusInCM(double radiusInCM) {
		this.radiusInCM = radiusInCM;
	}
	
	@Override
	public double calculateArea()
	{
		return Math.PI*Math.pow(radiusInCM,2);
	}
}
