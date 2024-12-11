package Recursion;

public class ReverseArray {
	
	public static void reversArray(int i,int[] arr, int j)
	{
		if(i>=j)
		{
			return;
		}
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		reversArray(++i, arr, --j);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the array");
		int[] a=new int[] {1,2,3,4,5,6,7,8,9,10};
		reversArray(0,a,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
