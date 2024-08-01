import java.util.*;
public class FindMajorityElement
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,no ;
		System.out.println("Enter the size of array");
		size=obj.nextInt();
		int []a,b;
		a=new int[size];
		b=new int[100];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Number to check majaority element");
		no=obj.nextInt();
		System.out.println("Checking majaority element");
		for(int i=0;i<a.length;i++)
		{
			b[(a[i])]=b[(a[i])]+1;
		}
		if(b[no]>(size/2))
		{
			System.out.println(no+" It is majar element");
		}
		else
		{
			System.out.println("It is Not majar element");
		}
	}
}