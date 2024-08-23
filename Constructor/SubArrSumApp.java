import java.util.*;
class SubArrSum
{
	int a[],sum,tsum,end;
	SubArrSum(int a[],int sum)
	{
		this.a=a;
		this.sum=sum;
	}
	
	void findSubArr()
	{
		for(int i=0;i<a.length;i++)
		{
			tsum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				tsum=tsum+a[j];
				if(tsum==sum)
				{
					end=j;
					System.out.print("Index Is ");
					for(int k=i;k<=end;k++)
					{
						System.out.print(k+" ");
					}
					System.out.print("Values Is ");
					for(int k=i;k<=end;k++)
					{
						System.out.print(a[k]+" ");
					}
					System.out.print("= "+tsum);
					System.out.println();
				}
			}
		}				
	}
}
public class SubArrSumApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum,a[],size;
		System.out.println("Enter the Size Of Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Sum to find");
		sum=sc.nextInt();
		SubArrSum s1=new SubArrSum(a,sum);
		s1.findSubArr();
		
		
		
	}
}