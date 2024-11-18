import java.util.*;
public class SubArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Sum to find");
		int Tsum=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			int sum=a[i];
			for(int j=i+1;j<=a.length-1;j++)
			{
				sum=sum+a[j];
				if(Tsum==sum)
				{
					System.out.print("[ "+i+"..."+j+" ] === { ");
					for(int k=i;k<=j;k++)
					{
						System.out.print(k+" ");
					}
					System.out.print(" }");
					System.out.println();
				}
			}
		}
	}
}