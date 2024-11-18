import java.util.*;
public class AddUsingArrayList
{
	public static void main(String args[])
	{
		ArrayList<Integer> id=new ArrayList<Integer>();
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		id.add(5);
		id.add(6);
		
		for(Integer element : id) //foreach give error if we not converted to Object class data
		{
			Object obj=element;
			System.out.println("The id Is "+obj);
		}
		
		System.out.println("Printing by implementing ArrayList and Using Iterator Function");
		Iterator i=id.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(" The Id IS ==>> "+obj);
		}
	}
}