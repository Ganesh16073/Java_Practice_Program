import java.util.*;
public class RemoveDuplicateArray
{
	public static void main(String x[])
	{
		Scanner obj=new Scanner(System.in);
		int []a;
		int i;
		int dup=0;
		a=new int[10];
		System.out.println("Enter the array Ellement");
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(i=1;i<a.length;i++) //remove duplicat logic
		{
			if(a[dup]!=a[i])
			{
				dup++;
				a[dup]=a[i];
			}
		}
		
		for(i=0;i<(a.length-dup+1);i++) //Display
		{
			System.out.println(a[i]);
		}
	}
}