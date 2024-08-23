import java.util.*;
class Programming
{
	Programming()
	{
		System.out.println("I Love Programming Language");
	}
	Programming(String a)
	{
		System.out.println("I Love "+a);
	}
}
public class ProgrammingConstructorApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("Enter the String To check Constructor");
		a=sc.nextLine();
		System.out.println("Constructor Without Parameter");
		Programming g=new Programming();
		System.out.println("Constructor With Parameter");
		Programming g1=new Programming(a);
	}
}