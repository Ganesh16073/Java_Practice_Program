import java.util.*;
public class FindNthMaximumElement
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,dup=0,NMax;
		int a[];
		System.out.println("ENter the Size of array");
		size=obj.nextInt();
		a=new int[size];
		System.out.println("Enter The Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Nth Max To Find");
		NMax=obj.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[dup]!=a[i])
			{
				dup++;
				a[dup]=a[i];
			}
		}
		System.out.println("The arrayis ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("The "+NMax+"Nth Largest Number is "+a[(a.length-dup+1)-NMax]);
	}
}	
			
		