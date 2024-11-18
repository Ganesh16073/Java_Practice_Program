public class AunomesInnerClass
{
	public static void main(String args[])
	{
		// we cannot create object of Abstract Class
		// A ref=new A();
		// but we can create anumous inner class
		
		A ref=new A()   // here we are no creating abstract class object. we are creating innerclass Object
		{
			public void show()
			{
				System.out.println("Printing show by anumous inner class of Abstract Class");
			}
		};
		ref.show();
		 // us this concept when we want to inplement method only one's
	}
}

abstract class A
{
	public abstract void show();
}