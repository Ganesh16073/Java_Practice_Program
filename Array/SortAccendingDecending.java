import java.util.*;
public class SortAccendingDecending
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[],temp;
		a=new int[5];
		System.out.println("Enter the Array Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		//logic for acceding
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The Accending Order of Array is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		// laogic for decending order
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The Decending Order of Array is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}