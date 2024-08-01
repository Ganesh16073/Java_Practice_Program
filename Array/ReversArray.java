import java.util.*;
public class ReversArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[],temp;
		a=new int[5];
		System.out.println("Enter the array Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		System.out.println("The Revers of Array is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		
		
			
		