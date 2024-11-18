import java.util.*;
public class CountTrueValues
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] str=new String[7];
		System.out.println("Enter the true or False to check count");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		
		Boolean b[]=str;
		System.out.println("The boolean String is");
		for(int i=0;i<b.length;i++)
		{
			System.oit.println(b[i]);
		}
	}
}