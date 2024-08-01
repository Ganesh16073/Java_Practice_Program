import java.util.*;
public class FindClosestSumTo0
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,sum=0,prev=0;
		System.out.println("Enter the Size of Arry");
		size=obj.nextInt();
		int a[],b[];
		a=new int[size];
		b=new int[2];
		System.out.println("Enter the Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++) //run upto length
		{
			for(int j=i+1;j<a.length;j++) //declar j to next of i
			{
				sum=a[i]+a[j];
				if(prev==0)
				{
					prev=sum;
				}
				if(sum>0)
				{
					if(sum<prev)
					{
						prev=sum;
						b[0]=a[i];
						b[1]=a[j];
					}
				}
				else if(sum<0)
				{
					if(-sum<prev)
					{
						prev=sum;
						b[0]=a[i];
						b[1]=a[j];
					}
				}
			}
		}
		System.out.println("The Sum: "+prev+"is closer to 0 with the value is "+b[0]+" and "+(b[1]));
	}
}	
				