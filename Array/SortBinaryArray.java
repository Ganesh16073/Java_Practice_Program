import java.util.*;
public class SortBinaryArray 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],size,temp;
		System.out.println("Enter the Size of Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element only 0 an 1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++) // logic to move all 0 to first
		{
			if(a[i]==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.println("Element Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}