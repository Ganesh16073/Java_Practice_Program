import java.util.*;
public class ReversEveryArrayElement
{
	public static void main(String Args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,temp,rev=0,rem,count=0;
		System.out.println("Enter the Size Of Array");
		size=obj.nextInt();
		int a[];
		a=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=obj.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			a[i]=rev;
			rev=0;
		}
		System.out.println("The Array Element revers is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
				