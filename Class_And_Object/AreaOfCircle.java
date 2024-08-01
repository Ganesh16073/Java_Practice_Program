import java.util.*;
class Circle
{
	private double radius;
	void setRadius(double x)
	{
		radius=x;
	}
	double callArea()
	{
		return 3.14*radius*radius;
	}
		
}
public class AreaOfCircle
{
	public static void main(String args[])
	{
		double rad;
		Scanner sc=new Scanner(System.in);
		Circle obj=new Circle();
		System.out.println("Enter the Radius of circle");
		rad=sc.nextDouble();
		obj.setRadius(rad);
		double result=obj.callArea();
		System.out.print("the Area of circle Is : "+result);
	}
}

