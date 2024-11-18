import java.util.*;
public class StringNumber
{
	public static void main(String args[])
	{
		int temp=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				temp=temp*10+(ch[i]-48);
			}
			else
			{
				sum=sum+temp;
				temp=0;
			}
		}
		sum=sum+temp;
		System.out.print(sum);
	}
}