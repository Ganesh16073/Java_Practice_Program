import java.util.*;
public class PermutationAndCombination 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		Solution.permutation("",str);
	}
}
class Solution
{
	public static void permutation(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return ;
		}
		char ch=up.charAt(0);
		
		for(int i=0;i<=p.length();i++)
		{
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			permutation(f+ch+s,up.substring(1));
		}
	}
}