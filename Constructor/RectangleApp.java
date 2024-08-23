import java.util.*;
class Rectangle
{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
		System.out.println("The Two Parameter constructor area is "+(l*b));
	}
	Rectangle(int side)
	{
		this.l = side;
        this.b = side;
		System.out.println("The One Parameter constructor area is "+(l*b));
	}
	Rectangle()
	{
		this.l = 0;
        this.b = 0;
		System.out.println("The No Parameter constructor area is "+(l*b));
	}
	
	
}
public class RectangleApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l,b,side;
		System.out.println("Enter the Length of rectangle");
		l=sc.nextInt();
		System.out.println("Enter the Breath of rectangle");
		b=sc.nextInt();
		System.out.println("Enter the side of rectangle");
		side=sc.nextInt();
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(side);
		Rectangle r3=new Rectangle(l,b);
	}
}