import java.util.*;
public class ComparatorApp
{
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<>();
		list.add(25);
		list.add(10);
		list.add(55);
		list.add(23);
		list.add(31);
		list.add(11);
		System.out.println("Before Default Sort() Logic  ==>> "+list);
		Collections.sort(list);
		System.out.println("Sort() default logic Output is ==>> "+list);
		
		Comparator<Integer> com=new Comparator<Integer>()
		{
			public int compare (Integer i,Integer j)
			{
				if(i%10>j%10) // swaping through lastDigit
				{
					return 1; // 1 means swap
				}
				else
				{
					return -1;// -1 means No Swap
				}
			}
		};
		
		// Comparator<Integer> com=(i,j) ->(i%10)>(j%10) ? 1:-1; // Using Lambda Expresion
		
		Collections.sort(list,com);
		System.out.println("Using Comparator to sort by lastDigits ==>> "+list);
		
		// we can use Comparable Interface where we overrige compareTo() Method, implement Comparable to a class on which class 
		// we want compare values like student class and want to compare with age 
		// we can compare with comparator and Compareable method  but personaly i think that Comparator is Is Easy to Implement 
		// Because we can use Lambda Expresion used to save time
		
		// Compare(Integer i, Integer j) it use Integer vlaue 
	}
}