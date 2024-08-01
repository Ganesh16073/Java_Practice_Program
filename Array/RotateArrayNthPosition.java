import java.util.*;
public class RotateArrayNthPosition
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,NRotate,temp;
		System.out.println("Enter the Size Of Array");
		size=obj.nextInt();
		int a[];
		a=new int[size];
		System.out.println("Enter the array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Position to Rotate");
		NRotate=obj.nextInt();
		if(NRotate>size)
		{
			while(NRotate<=size)
			{
				NRotate-=size;
			}
		}
		for(int i=0;i<NRotate;i++) //rotate left side
		{
			for(int j=i+1;j<NRotate;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int i=NRotate;i<a.length;i++) // rotate right Side
		{
			for(int j=i+1;j<a.length;j++)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		for(int i=0;i<a.length/2;i++) //rotate full array
		{
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		
		System.out.println("The Rotated Array Is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}