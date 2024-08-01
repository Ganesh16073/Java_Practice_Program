import java.util.*;
public class SumOfArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a[],sum=0;
		a=new int[5];
		System.out.println("Enter the Array Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		System.out.println("The Sum of array is "+sum);
	}
}