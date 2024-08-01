import java.util.*;
class Power
{
	private int base,index,pow=1;
	void setValue(int b,int i)
	{
		index=i;
		base=b;
	}
	int findPower()
	{
		for(int i=1;i<=index;i++)
		{
			pow=pow*base;
		}
		return pow;		
	}
}
public class FindPower
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int in,bs;
		Power obj=new Power();
		System.out.println("Enter the base");
		bs=sc.nextInt();
		System.out.println("Enter the Index");
		in=sc.nextInt();
		obj.setValue(in,bs);
		int result=obj.findPower();
		System.out.println("The value is "+result);
		
	}
}