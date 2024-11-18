import java.util.*;
abstract class Palindrome
{
	protected String str;
	public void setString(String str)
	{
		this.str=str;
	}
	public void isPalindrome()
	{
	}
}
class CheckPalindrome extends Palindrome
{
	public void isPalindrome()
	{
		int c=1;
		for(int i=0,j=(str.length()-1);i<str.length()/2;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				System.out.println("It Is Not Palindrome");
				c=0;
				break;
			}
		}
		if(c==1)
		{
			System.out.println("It Is Palindrome");
		}
	}
	
}
public class PalindromeApp
{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  String to check Palindrome");
		str=sc.nextLine();
		CheckPalindrome cp=new CheckPalindrome();
		cp.setString(str);
		cp.isPalindrome();
	}
}