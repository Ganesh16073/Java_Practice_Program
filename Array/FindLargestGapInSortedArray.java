import java.util.*;
class FindGap
{
	int a[];
	int count=0,precount=0,start=0,end=0,temp;
	void setArray(int a[])
	{
		this.a=a;
	}
	public int getGap()
	{
		for(int i=0;i<a.length;i++) // sort array
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
		
		for(int i=0;i<a.length-1;i++) //logic
		{
			count=0;
			for(int j=a[i];j<a[i+1];j++)
			{
				++count;
			}
			if(count>precount)
			{
				start=a[i];
				end=a[i+1];
				precount=count;
			}
		}
		System.out.println("The Element are "+start+" & "+end);
		return precount;
	}
	
}

public class FindLargestGapInSortedArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		FindGap g=new FindGap();
		int a[],size;
		System.out.println("Enter the Size Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		g.setArray(a);
		int result=g.getGap();
		System.out.println("The largest gap between element is "+result);
	}
		
}