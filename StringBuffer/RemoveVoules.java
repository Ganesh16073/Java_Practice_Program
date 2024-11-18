import java.util.*;
public class RemoveVoules
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer b=new StringBuffer("ganesh");
		for(int i=0;i<b.length();i++)
		{
			char ch=b.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				{
					b.deleteCharAt(i);
					i--;
                }
		}
		
		System.out.println(b);
	}
	
}