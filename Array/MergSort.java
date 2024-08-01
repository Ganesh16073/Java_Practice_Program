import java.util.*;
class solution
{
	public static void mergsort(int[] arr,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int mid=(low+high)/2;
		mergsort(arr,low,mid);
		mergsort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	public static void merge(int[] arr,int low,int mid,int high)
	{
		ArrayList<Integer> temp=new ArrayList<>();
		int left=low;
		int right=mid+1;
		
		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				temp.add(arr[left]);
				left++;
			}
			else
			{
				temp.add(arr[right]);
				right++;
			}
		}
		
		while(left<=mid)
		{
			temp.add(arr[left]);
			left++;
		}
		
		while(right<=high)
		{
			temp.add(arr[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++)
		{
			arr[i]= temp.get(i-low);
		}
	}		
}
public class MergSort
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("Enter thee size of Array");
		n=obj.nextInt();
		int arr[];
		arr=new int[n];
		System.out.println("Enter the Array Element");
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		solution.mergsort(arr,0,n-1);
		System.out.println("The Merge Sorted Array Element are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}		