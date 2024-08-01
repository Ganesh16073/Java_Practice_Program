import java.util.*;
class Solution
{
	public static void mergesort(int[] a,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int mid=(low+high)/2;
		mergesort(a,low,mid);
		mergesort(a,mid+1,high);
		merge(a,low,mid,high);
	}
	
	public static void merge(int[] a,int low,int mid,int high)
	{
		ArrayList<Integer> temp=new ArrayList<>();
		int left=low;
		int right=mid+1;
		
		while(left<=mid && right<=high)
		{
			if(a[left]<=a[right])
			{
				temp.add(a[left]);
				left++;
			}
			else
			{
				temp.add(a[right]);
				right++;
			}
		}
		
		while(left<=mid)
		{
			temp.add(a[left]);
			left++;
		}
		while(right<=high)
		{
			temp.add(a[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++)
		{
			a[i]=temp.get(i-low);
		}
		
	}
}
		
				
				
public class MergeSorting
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size ;
		System.out.println("Enter the Size of Array");
		size=obj.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		Solution.mergesort(a,0,size-1);
		System.out.println("The MergeSorted Array Is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}