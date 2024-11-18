public class InnerClassApp
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		o.show(); // can call but cant call config
		
		Outer.Inner i=new o.Inner();  // this is how object of inner class is Created
		// Parrentclass.InnerClass ref= ParrentRef.Inner();
	}
}
class Outer
{
	public void show()
	{
		System.out.println("I am From Outer Class");
	}
	
	class Inner
	{
		public void config()
		{
			System.out.println("I am From Inner Class");
		}
	}
}