import java.util.*;
public class InsretArrayElement
{
	public static void main(String args[])
	{ 
		Scanner obj=new Scanner(System.in);
		int []a;
		int index,value,size;
		System.out.println("Enter the size of array");
		size=obj.nextInt();
		a=new int[size+1];
		System.out.println("Enter the Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Index to insert value");
		index=obj.nextInt();
		System.out.println("Enter the value");
		value=obj.nextInt();
		
		for(int i=a.length-1;i>=index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println("THe array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
	}
}