import java.util.*;
public class FindMaximumRepeatingElement
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,size2=0,max=0;
		System.out.println("Enter the size of array");
		size=obj.nextInt();
		int []a,b;
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
			if(a[i]>size2)
			{
				size2=a[i];
			}
		}
		b=new int[size2];
		System.out.println("Checking maximum Repeating element");
		for(int i=0;i<b.length;i++) //storing count in array 2
		{
			b[(a[i])]=b[(a[i])]+1;
		}
		for(int i=0;i<b.length;i++) //check max count
		{
			if(b[i]>max)
			{
				max=i;
			}
		}
		System.out.println(b[max]+" is Maximum Repeating element");
		
	}
}