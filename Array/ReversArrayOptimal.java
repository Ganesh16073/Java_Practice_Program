import java.util.*;
public class ReversArrayOptimal
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[],size,temp;
		System.out.println("Enter the size of array");
		size=obj.nextInt();
		a=new int[size];
		System.out.println("Enter the array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<(a.length/2);i++)
		{
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println("The Revers of array is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		
		
		