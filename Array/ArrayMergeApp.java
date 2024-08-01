import java.util.*;
public class ArrayMergeApp
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int []a,b,c;
		int j=0;
		a=new int[5];
		b=new int[5];
		c=new int[10];
		System.out.println("Enter the 1st array element");
		for(int i=0;i<a.length;i++) //input a[]
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the 2nd array element");
		for(int i=0;i<b.length;i++) //input b[]
		{
			b[i]=obj.nextInt();
		}
		System.out.println("the merg of array is");
		for(int i=0;i<a.length;i++) // insert a[] into c[]
		{
			c[j]=a[i];
			j++;
		}
		
		for(int i=0;i<b.length;i++) // insert b[] into c[]
		{
			c[j]=b[i];
			j++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
			
		
		