import java.util.*;
public class SeprateEvenOddNumberInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],size,j=0,temp;
		System.out.println("Enter the Size of Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Element Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) // logic to push even number to first  // automaticaly odd number come last
		{
			if(a[i]%2==0)
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
		}
		System.out.println("Enter the Even first Element Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
				
	}
}