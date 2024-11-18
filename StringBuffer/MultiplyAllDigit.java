import java.util.*;
public class MultiplyAllDigit
{
	public static void main(String args[])
	{
		int sum=1;
		StringBuffer b=new StringBuffer("hello 123 java 45");
		for(int i=0;i<b.length();i++)
		{
			char ch=b.charAt(i);
			if(ch>=48 && ch<=57)
			{
				sum=sum*(ch-48);
			}
		}
		System.out.println("The Multiplication of Digit is "+sum);
	}
}