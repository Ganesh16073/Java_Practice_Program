import java.util.*;
public class StringLongestPalindrome
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String str;
		System.out.println("Enter the String ");
		str=sc.nextLine();
		System.out.println("Finding Longest Palnidrome");
		int start=0;
		int maxLength=1;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(Solution.checkPal(str,i,j)==true && ((j-i+1)>maxLength))
				{
					start=i;
					maxLength=(j-i+1);
				}
			}
		}
		System.out.println("The Longest Palindrom is "+(str.substring(start,(start+maxLength))));
		
		
	}

}

class Solution
{
	public static boolean checkPal(String str,int i,int j)
	{
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
