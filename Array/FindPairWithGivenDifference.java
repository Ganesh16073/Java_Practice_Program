import java.util.*;
public class FindPairWithGivenDifference
{
	public static  void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,TDif,flag=0,count=0;
		System.out.println("Enter the Size Of array");
		size=obj.nextInt();
		int a[];
		a=new int[size];
		System.out.println("Enter the array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Target Difference");
		TDif=obj.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]-a[j]==TDif)
				{
					System.out.println("{"+a[i]+","+a[j]+"}" );
					flag=1;
					count++;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("The Difference IS Not Found");
		}
	}
}				