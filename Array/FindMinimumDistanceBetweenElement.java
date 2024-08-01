import java.util.*; // logic not correct
public class FindMinimumDistanceBetweenElement
{
	public static void main(String arg[])
	{
	Scanner obj=new Scanner(System.in);
	int size,E1,E2,start=0,end=0,SValue,Evalue,flag=0,flag1=0,count=0;
	System.out.println("Enter the size of aray");
	size=obj.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=obj.nextInt();
	}
	System.out.println("Enter the two element to find Minimum Distance");
	E1=obj.nextInt();
	E2=obj.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==E1 || a[i]==E2 && flag==0)
		{
			start=i;
			SValue=a[i];
			flag=1;
			flag1=1;
		}
		else if(a[i]==E1 ||a[i]==E2 && flag1==1)
		{
			end=i;
			Evalue=a[i];
			flag1=0;
		}
	}
	for(int i=start;i<=end;i++)
	{
		count++;
	}
	System.out.println("The Minimum distance between two Element is "+count+" And Index Are "+start+" and "+end);
	}
}

			
			
		
			
	