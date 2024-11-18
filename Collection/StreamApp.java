import java.util.*;
import java.util.stream.*;
public class StreamApp
{
	public static void main (String args[]) throws Exception
	{
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.forEach(n-> System.out.println(n)); //accept method is impemented 
		
		Stream<Integer> s=list.stream(); // in s it store all value 
		System.out.println("Stream is"+s);
		Stream<Integer> s1=s.filter(n ->(n%2)==0); // Predicate -> boolean test() is excuted
		System.out.println("Filtered Stream "+s1);
		Stream<Integer> s2=s1.map(n-> (n*2)); // apply() method implemented
		System.out.println("After Map"+s2);
		int result=s2.reduce(0,(c,e)->c+e); //
		System.out.println("Using reduce() Sum is => "+result);
	}
}