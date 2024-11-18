import java.util.*;
public class CollectionMethod
{
	public static void main(String args[])
	{
		Object[] obj=new Object[3];
		
		obj[0]=10;
		obj[1]=true;
		obj[2]=new Random();
		
		for(Object ob:obj)
		{
			System.out.println(ob);
		}
		ArrayList<Integer> a=new ArrayList<>();
		boolean check=a.add(10); // add to return true or false
		System.out.println(check+" Element Added usind add() Method");
		a.add(20);
		a.add(30);
		a.add(40);
		
		check=a.contains(30);  // check element
		System.out.println("Is 30 Present in array using contains() => "+check);
		
		Iterator i=a.iterator(); // access and print
		System.out.println("The Elemens are using Iterator, hasNext(), next()");
		while(i.hasNext())
		{
			System.out.println(i.next());
			// if(i.next()==20)
			// {
				// a.remove(i);
			// }
		}

		a.remove(3); // delete by index
		System.out.println("removing 30 using remove(index) ");
		i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		// Integer[] arr=a.toArray();
		
		
		
	
	}
}