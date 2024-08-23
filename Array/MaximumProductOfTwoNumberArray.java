import java.util.*;
class MaximumProductOfTwoNumberArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],size,product=0,n1=0,n2=0;
		System.out.println("Enter the Array Size");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) // logic to find maximum Product of two Element in array
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]*a[j]>product)
				{
					n1=a[i];
					n2=a[j];
					product=a[i]*a[j];
				}
			}
		}
		
		System.out.println("The maximum Product of two Element in array is "+product+" the Number is "+n1+" & "+n2);
	}

}