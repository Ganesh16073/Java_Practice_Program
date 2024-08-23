import java.util.*;
class FindMinimumDifference
{
	int a[],m,temp;
	int diff=0;
	void setArray(int a[],int m)
	{
		this.a=a;
		this.m=m;
	}
	public int getMinDifference()
	{
		for(int i=0;i<a.length;i++)//logic to sort
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
		for(int i=a[0];i<a[m-1];i++) // logic
		{
			++diff;
		}
		return diff;
	}
}
public class FindMinimumDifferenceBetweenChocolate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],size,m;
		System.out.println("Enter the Size of Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the minimum combination");
		m=sc.nextInt();
		
		FindMinimumDifference fm=new FindMinimumDifference();
		fm.setArray(a,m);
		int result=fm.getMinDifference();
		System.out.println("The minimum Difference is "+result);
		
	}
}
