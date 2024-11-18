public class PremutationCheck
{
	public static void main(String args[])
	{
	
		String st=new String("ABC");
		Solution.checkPermutation("",st);
		
	
	}
}
class Solution
{
	public static void checkPermutation(String p, String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++)
		{
			String first=p.substring(0,i);
			String second=p.substring(i,p.length());
			checkPermutation(first+ch+second,up.substring(1));
		}
		
	}
	
}