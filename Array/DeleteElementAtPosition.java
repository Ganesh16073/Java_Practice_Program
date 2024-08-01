import java.util.*;
public class DeleteElementAtPosition
{
	public static void main(String x[])
	{
		Scanner obj=new Scanner(System.in);
		int size,pos;
		System.out.println("Enter the  Size Of Array");
		size=obj.nextInt();
		int a[];
		a=new int[size];
		System.out.println("Enter the Array Elament");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Position to Delete");
		pos=obj.nextInt();
		
		for(int i=pos;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.println("The Deleted Array is");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}