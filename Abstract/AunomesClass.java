public class AunomesClass
{
	public static void main (String args[])
	{
		A ref=new A()
		{
			public void show()
			{
				System.out.println("Printing From Main class");
				System.out.println("By Using Aunomes Class");
			}
		};
		ref.show();
	}
}

class A
{
	public void show()
	{
		System.out.println("Printing From A class");
	}
}