import java.util.*;
public class FindSumFromArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[],sum,Tsum=0,start=0,end=0,size,flag=0;
		System.out.println("Enter the Size of array");
		size=obj.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Sum to find");
		sum=obj.nextInt();
		for(int i=0;i<a.length;i++)
		{
			Tsum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				Tsum=Tsum+a[j];
				if(Tsum==sum)
				{
					start=i;
					end=j;
					System.out.print("[ "+start+"..."+end+" ]"+" = "+"{ ");
					flag=1;
					for(int k=start;k<=end && flag==1;k++)
					{
						System.out.print(a[k]+" ");
					}
					if(flag==1)
					{
						System.out.print(" }");
						System.out.println();
					}
				}
			}
			flag=0;
		}
	}
}