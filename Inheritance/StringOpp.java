import java.util.*;
public class StringOpp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to Perform Operation");
		String str=sc.nextLine();
		ConvertToUpper c=new ConvertToUpper();
		c.performOperation(str);
		
	}
}
class ConvertToUpper
{
	char ch[];
	public void performOperation(String str)
	{
		ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)((int)ch[i]-32);
			}
		}
		System.out.println(ch);
	}
	
	
}