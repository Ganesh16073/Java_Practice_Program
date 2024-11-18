import java.util.*;
public class HashApp
{
	public static void main(String args[])
	{
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		Iterator i=s.iterator();
		for(Integer val:s)
		{
			System.out.println(val);
		}
		System.out.println("HashSet does not store Dublicate Values");
		System.out.println("HashSet Does not use index");
		System.out.println("HashSet is like pick an elment from bag it give output in random ");
		System.out.println();
		System.out.println("we can use TreeSet which ive sorted values");
		
		
	}
}