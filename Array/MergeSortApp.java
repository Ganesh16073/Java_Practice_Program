import java.util.*;
class solution
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
public class MergeSortApp
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n=obj.nextInt();
		int a[];
		a=new int[n];
		System.out.println("Enter thr Array Element");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		solution.mergesort(a,0,n-1);
		System.out.println("The Merge Sorted Array Is");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}