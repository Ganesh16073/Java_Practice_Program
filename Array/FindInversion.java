import java.util.*;
public class FindInversion
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,count=0;
		System.out.println("Enter the Array Size");
		size=obj.nextInt();
		int a[];
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					++count;
				}
			}
		}
		System.out.println("The Inversion count is "+count);
	}
}