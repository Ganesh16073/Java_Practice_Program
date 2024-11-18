import java.util.*;
public class RemoveDuplicate
{
	public static void main(String args[])
	{
		StringBuffer b=new StringBuffer("Engineering");
		for(int i=0;i<b.length()-1;i++)
		{
			for(int j=i+1;j<b.length();j++)
			{
				if(b.charAt(i)==b.charAt(j))
				{
					b.deleteCharAt(j);
					
				}
			}
		}
		System.out.println(b);
	}
}