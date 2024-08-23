import java.util.*;
public class MediumApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a,b,c;
		int size1,size2,temp;
		double medium;
		System.out.println("Enter the Size of First array");
		size1=sc.nextInt();
		System.out.println("Enter the Size of Second array");
		size2=sc.nextInt();
		a=new int[size1];
		b=new int[size2];
		c=new int[size1+size2];
		System.out.println("Enter the Size of First array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of Second array Element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++) //add first array
		{
			c[j]=a[i];
			j++;
		}
		for(int i=0;i<b.length;i++) //add first array
		{
			c[j]=b[i];
			j++;
		}
		System.out.println("Before Sort Array");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		for(int i=0;i<c.length;i++) // Sort Third array array
		{
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println("After Sort Array");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		if((c.length)%2==0) //array medium
		{
			medium=(double) (c[(c.length/2)-1]+c[c.length/2])/2;
		}
		else
		{
			medium=(double) a[a.length/2];
		}
			
		
		System.out.println("The Medium is "+medium);
	}
}