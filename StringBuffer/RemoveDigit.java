import java.util.*;
public class RemoveDigit
{
	public static void main(String args[])
	{
		StringBuffer b=new StringBuffer("Hello 12384 Jav65a 4565 De54veloper");
		System.out.println(b);
		for(int i=0;i<b.length();i++)
		{
			char ch=b.charAt(i);
			if((ch>=65 &&  ch<=90) || (ch>=97 && ch<=122) || ch==32 )
			{
				continue;
				
			}
			else
			{
				b.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("After Removing the degit and  symbols is " );
		System.out.print(b);
	}

}