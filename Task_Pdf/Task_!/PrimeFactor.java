import java.util.*;
public class PrimeFactor
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],size;
		System.out.println("Enter the Size of Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Solution obj=new Solution();
		obj.setValue(a);
		obj.allPrimeFactor();
	}
}
class Solution
{
	int arr[];
	void setValue(int[] a)
	{
		arr=a;
	}
	void allPrimeFactor()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" = ");
			for(int j=2;j<=arr[i];j++)
			{
				while(arr[i]%j==0)
				{
					System.out.print(j+", ");
					arr[i]/=j;
				}
				
			}
			System.out.println();
		}
	}
}

// 12
// 15
// 28
// 35
// 49
// 12 = 2, 2, 3,
// 15 = 3, 5,
// 28 = 2, 2, 7,
// 35 = 5, 7,
// 49 = 7, 7,