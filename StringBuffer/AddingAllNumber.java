import java.util.*;
public class AddingAllNumber
{
	public static void main(String args[])
	{
		int temp=0,sum=0;
		
		StringBuffer b=new StringBuffer("Hello 100 java 50 Developer 90 at 10");
		for(int i=0;i<b.length();i++)
		{
			char ch=b.charAt(i);
			if(ch>=48 && ch<=57)
			{
				temp=temp*10+(b.charAt(i)-48);
			}
			else
			{
				sum=sum+temp;
				temp=0;
			}
		}
		sum+=temp;
		System.out.println("the Sum of Digit in String is "+sum);
	}
}