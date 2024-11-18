import java.util.*;
public class DownCasting
{
	public static void main(String args[])
	{ 
		ParentClass p=(ParentClass) new ChildClass(); // UpCasting
		p.message();
		
		ChildClass c=(ChildClass) p; // downcasting
		c.message();
		
		
		
	}
}
class ParentClass
{
	String name;
	void message()
	{
		System.out.println("I am Parent Class");
	}
}
class ChildClass extends ParentClass
{
	int age;
	void message()
	{
		System.out.println("I am Child Class");
	}
}
