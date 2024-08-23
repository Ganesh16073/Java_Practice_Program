import java.util.*;
class Circle
{
	private double radius;
	void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double showArea()
	{
		return (radius*radius*3.14);
	}
}
public class AreaApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double rad,area;
		System.out.println("Enter the Radius of Circle to find Area");
		rad=sc.nextDouble();
		Circle c=new Circle();
		c.setRadius(rad);
		area=c.showArea();
		System.out.println("The Area of Circle is "+area);
	}
}