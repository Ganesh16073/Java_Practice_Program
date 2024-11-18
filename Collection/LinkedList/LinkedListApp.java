import java.util.*;
public class LinkedListApp
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(System.identityHashCode(obj));
		}
	}
}