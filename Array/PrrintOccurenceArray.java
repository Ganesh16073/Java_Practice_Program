import java.util.*;
public class PrrintOccurenceArray
{
	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);
		int size,a[];
		System.out.println("Enter the Size of array");
		size=obj.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The occurrence is "+i+" And The Value is "+(a[i]));
		}
	}
}