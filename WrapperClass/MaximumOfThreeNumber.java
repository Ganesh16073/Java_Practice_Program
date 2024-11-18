import java.util.*;
public class MaximumOfThreeNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Integer String");
		String str1=sc.next();
		System.out.println("Enter the second Integer String");
		String str2=sc.next();
		System.out.println("Enter the third Integer String");
		String str3=sc.next();
		
		Integer a=Integer.parseInt(str1);
		Integer b=Integer.parseInt(str2);
		Integer c=Integer.parseInt(str3);
		
		if(a>b && a>c)
		{
			System.out.println(a +" IS Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println(b +" IS Greater");
		}
		else if(c>a && c>b)
		{
			System.out.println(c +" IS Greater");
		}
		
		
		
	}
}