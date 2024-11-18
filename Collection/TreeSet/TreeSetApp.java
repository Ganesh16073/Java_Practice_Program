import java.util.*;
public class TreeSetApp
{
	public static void main(String args[])
	{
		Set<Integer> s=new TreeSet<>();
		s.add(70);
		s.add(80);
		s.add(10);
		s.add(40);
		s.add(50);
		s.add(20);
		s.add(30);
		s.add(60);
		
		Iterator i=s.iterator();
		for(Integer val:s)
		{
			System.out.println(val);
		}
		System.out.println("TreeSet give output in Sorted Values");
		
		
	}
}