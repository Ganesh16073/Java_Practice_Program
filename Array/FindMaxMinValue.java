import java.util.*;
public class FindMaxMinValue
{
	public static void main(String args[])
	{
		int a[]; // Reference variable
		int max,min;
		a=new int[5];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array Value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		max=a[0];
		min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The maximum Value is "+max);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The minimum Value is "+min);
	}
}
		
				