import java.util.*;
public class ProductOfEveryOtherEementArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],b[],size,product=1;
		System.out.println("ENter the Size Of Array");
		size=sc.nextInt();
		a=new int[size];
		b=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) // logic to to replace each element of the array with the product of every other element  in a given array of integers
		{
			product=1;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					continue;
				}
				else
				{
					product=product*a[j];
				}
			}
			b[i]=product;
		}
		
		for(int i=0;i<b.length;i++) // copy temp to original array
		{
			a[i]=b[i];
		}
		System.out.println("The Product of Array Element is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}