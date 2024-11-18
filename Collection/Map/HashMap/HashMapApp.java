import java.util.*;
public class HashMapApp
{
	public static void main(String args[])
	{
		Map<String,Integer> mp=new HashMap<>();
		mp.put("Key",1);
		mp.put("English",80);
		mp.put("Tamil",90);
		mp.put("Maths",94);
		mp.put("English",98);
		
		System.out.println("Map work with key and values");
		System.out.println("Key CanNot be Duplicate");
		System.out.println("Value Can be Duplicate");
		System.out.println("Key are like set and value are like list");
		System.out.println();
		
		System.out.println("All Keys Are =>> "+mp.keySet()); // return all Keys
		System.out.println("All Values are =>> "+mp.values()); // return all Values
		
		for(String key:mp.keySet())
		{
			System.out.println("The Key is =>> "+key+"\t The Value is ==> "+mp.get(key));
			
		}
		
		
		
		
	}
}