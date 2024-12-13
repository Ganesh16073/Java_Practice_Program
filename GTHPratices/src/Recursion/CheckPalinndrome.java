package Recursion;

public class CheckPalinndrome {
	
	public static boolean checkPal(String str,int i,int j)
	{
		if(i>=j)
		{
			return true;
		}
		String dup=str.toLowerCase();
		if(dup.charAt(i)!=dup.charAt(j))
		{
			return false;
		}
		
		return checkPal(str,++i,--j);
	}
	

	public static void main(String[] args) {
//		System.out.println("Enter the String to check Palindrome");
		String str="Madam";
		
		if(checkPal(str,0,str.length()-1))
		{
			System.out.println("The String Is Palindrome");
		}
		else
		{
			System.out.println("The String is Not Palindrome");
		}
		
	}
}
