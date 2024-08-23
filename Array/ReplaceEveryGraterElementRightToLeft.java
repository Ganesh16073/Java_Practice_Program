import java.util.*;
public class ReplaceEveryGraterElementRightToLeft
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int max=0,temp;
		int a[],size;
		System.out.println("Enter the Size of Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=a.length-1;i>=0;i--) //logic to Replace Every Grater Element Right To Left
		{
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]>a[j] )
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=a.length-1;i>=0;i--) //logic to Replace negative number in max order
		{
			for(int j=i-1;j>=0;j--)
			{
				if(a[j]>a[i] && a[j]<0 )
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("The Replaced Every Grater Element Right To Left is");
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
}