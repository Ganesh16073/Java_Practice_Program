import java.util.*;
public class FindSumOccurenceArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,sum;
		System.out.println("Enter The Size of Array");
		size=obj.nextInt();
		int a[];
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter The Sum To find");
		sum=obj.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(+i+" and "+j); 
				}
			}
		}
	}
}
		
		