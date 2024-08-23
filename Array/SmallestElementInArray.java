import java.util.*;
public class SmallestElementInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[];
		int size,fsmall,ssmall;
		System.out.println("Enter the Size of Array");
		size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		fsmall=a[0];
		ssmall=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<fsmall)
			{
				ssmall=fsmall;
				fsmall=a[i];
			}
		}
		System.out.println("The first small element is "+fsmall);
		System.out.println("The Second small element is "+ssmall);
	}
}