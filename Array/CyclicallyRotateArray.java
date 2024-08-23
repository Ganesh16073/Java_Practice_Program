import java.util.*;
public class CyclicallyRotateArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[];
		int size,n,temp;
		System.out.println("Enter the Size of array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Number of times to rotate");
		n=sc.nextInt();
		
		while(n>size)
		{
			n=n-size;
		}
		System.out.println("n is"+n);
		for(int i=0;i<n-1;i++) // left rotate
		{
			for(int j=i+1;j<n-1;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		System.out.println("The Rotated Array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=n-1;i<a.length;i++) // RIght rotate
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		System.out.println("The Rotated Array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) // full rotate rotate
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		System.out.println("The Rotated Array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
} 