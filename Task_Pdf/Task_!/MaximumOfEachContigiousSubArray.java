import java.util.*;
public class MaximumOfEachContigiousSubArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int size,sub,flag=0,max=0,temp;
		System.out.println("Enter the Size of Array");
		size=obj.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Sub Contiginous");
		sub=obj.nextInt();
		if(sub>size)
		{
			System.out.println("The Sub Contiginou is Gerater than Size");
			flag=1;
		}
		for(int i=0;i<a.length && flag==0;i++)
		{
			if(sub<=a.length)
			{
				temp=i;
				while(temp<sub)
				{
					if(max<a[temp])
					{
						max=a[temp];
					}
					System.out.print(a[temp]+" ");
					temp++;
				}
				System.out.println("Max = "+max);
				sub++;
			}
		}
	}
}
			
			
		
		
