public class FirstThread
{
	public static void main(String args[])
	{
		A obj=new A();
		B obj1=new B();
		// System.out.println(obj.getPriority()); to priority the object of a class
		obj1.setPriority(Thread.MAX_PRIORITY); // it does not run in syncroize because Scedulers decides whith thread to run
		
		obj.start(); // Start is the Method of Thread
		obj1.start();
		
	}
}
class A extends Thread
{
	public void run() // run is the Method of Runnable Class
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Hii");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
class B extends Thread
{
	
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}