import java.util.*;
public class MoveAll0ToLast
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of array");
		size=obj.nextInt();
		int a[];
		a=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<a.length;i++) // logic for move zero to last
		{
			if(a[i]==0)
			{
				for(int j=i+1,k=i;j<a.length;j++)
				{
					a[k]=a[j];
					k++;
				}
				a[a.length-1]=0;
			}
		}
		System.out.println("The array element Are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
				
