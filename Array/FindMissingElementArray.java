import java.util.*;
public class FindMissingElementArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[],size,temp;
		System.out.println("Enter the Size of array");
		size=obj.nextInt();
		a=new int[size];
		System.out.println("Enter the Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++) // acceending order
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			
		System.out.println("The missing Element in array are");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.println(" "+j);
			}
		}
	}
}