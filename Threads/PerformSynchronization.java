public class PerformSynchronization
{
	public static void main(String args[])
	{
		Runnable r1=new A();
		Runnable r2=new B();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
class Common
{
	static int count=0;
	
	public synchronized void printNumber() throws Exception
	{
		
		while(count<=26)
		{
			System.out.println(count);
			count++;
			notify();
			if(count<=26)
			{
				wait();
			}
		}
		notify();
		
	}
	
	
}

class A implements Runnable
{
	
	
}

class B implements Runnable
{
	static char ch='A';
	public synchronized void run() throws InterruptedException
	{
		notify();
		while(ch<=90)
		{
			System.out.println(ch);
			ch++;
			wait();
		}
		notify();
		
	}
}