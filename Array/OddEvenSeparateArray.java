import java.util.*;
public class OddEvenSeparateArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,j=0,k=0;
		System.out.println("Enter the Size of Array");
		size=obj.nextInt();
		int []a,odd,even;
		a=new int[size];
		odd=new int[size];
		even=new int[size];
		System.out.println("Enter the array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++) //finnd odd or even
		{
			if (a[i]%2==0)
			{
				even[j]=a[i];
				j++;
			}
			else
			{
				odd[k]=a[i];
				k++;
			}
		}
		System.out.println("odd number in array is");
		for(int i=0;i<odd.length;i++)
		{
			System.out.println(odd[i]);
		}
		System.out.println("Even number in array is");
		for(int i=0;i<even.length;i++)
		{
			System.out.println(even[i]);
		}
	}
}
				
		