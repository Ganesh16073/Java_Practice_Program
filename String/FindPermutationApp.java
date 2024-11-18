import java.util.*;
public class FindPermutationApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String st=sc.nextLine();
		ArrayList<String> l=Solution.permutation("",st);
		System.out.println("The Combinations are =>> "+l);
		System.out.println("The Count of combinatoin is  =>> "+Solution.count);
		
	}
}
class Solution
{
	static int count=0;
	static ArrayList<String> list=new ArrayList<>();
	public static ArrayList<String> permutation(String p,String up)
	{
		if(up.isEmpty())
		{
			++count;
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++)
		{
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			permutation(f+ch+s,up.substring(1));
		}
		return list;
	}
}