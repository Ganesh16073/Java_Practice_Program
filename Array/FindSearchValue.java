import java.util.*;
public class FindSearchValue
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[],Skey,flag=0;
		a=new int[5];
		System.out.println("Enter the Array Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter Search value");
		Skey=obj.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(Skey==a[i])
			{
				System.out.println("THe value Is in INdex "+i);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("The value Not Found");
		}
	}
}