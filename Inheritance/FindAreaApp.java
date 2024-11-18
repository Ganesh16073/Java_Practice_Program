import java.util.*;
public class FindAreaApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double radius=sc.nextDouble();
		
		System.out.println("Enter side");
		double side=sc.nextDouble();
		
		System.out.println("Enter length");
		double length=sc.nextDouble();
		
		System.out.println("Enter breath");
		double breaths=sc.nextDouble();
		 
		FindArea fda=new FindArea();
		Data d=null;
		
		d=new Circle();
		d.setRadius(radius);
		fda.getArea(d);
		
		d=new Square();
		d.setSide(side);
		fda.getArea(d);
		
		
		
		
	}
}
abstract class Data
{
	double length,breath;
	double radius,side;
	public void setLength(double l)
	{
		length=l;
	}
	public double getLength()
	{
		return length;
	}
	
	public void setBreath(double b)
	{
		breath=b;
	}
	public double getBreath()
	{
		return breath;
	}
	
	public void setRadius(double r)
	{
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setSide(double s)
	{
		side=s;
	}
	public double getSide()
	{
		return side;
	}
	
	abstract double getResult();
}
class FindArea
{
	public void getArea(Data d)
	{
		double result=d.getResult();
		System.out.println("Area is "+result);
		
	}
}
class Square extends Data
{
	public double getResult()
	{
		return side*side;
	}
}
class Rectangle extends Data
{
	public double getResult()
	{
		return length*breath;
	}
}
class Circle extends Data
{
	public double getResult()
	{
		return 3.14*radius*radius;
	}
}