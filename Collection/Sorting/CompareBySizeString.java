import java.util.*;
public class CompareBySizeString
{
	public static void main(String args[])
	{
		List<String> list=new ArrayList<>();
		list.add("Ten");
		list.add("Ganesh");
		list.add("Akhi");
		list.add("Tenacious");
		list.add("KingKong");
		list.add("Don");
		
		Collections.sort(list); // comparing throug asci code but same logic of Accenging Alphabet order
		System.out.println("Default Compare by Alphabet. Accending Alphabet Order =>> "+list);
		
		Comparator<String> com=(i,j) -> i.length()>j.length()?1:-1; // comparing through size
		Collections.sort(list,com);
		System.out.println("Comparing by size of String using Comparator =>> "+list);
	}
}