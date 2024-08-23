import java.util.*;
class FindNArmStrong
{
	int n,temp,rem,sum,count;
	FindNArmStrong(int n)
	{
		this.n=n;
	}
	public void showAllNumbersBetweenLimt()
	{
		for(int i=1;i<=n;i++)
		{
			temp=i;
			sum=0;
			count=0;
			while(temp!=0)
			{
				temp=temp/10;
				count++;
			}
			temp=i;
			while(temp!=0)
			{
				rem=temp%10;
				sum=sum+(int)Math.pow(rem,count);
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
		}
	}
	
}
public class FindNArmStrongApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Range to find ArmStrong Number");
		n=sc.nextInt();
		FindNArmStrong fn=new FindNArmStrong(n);
		fn.showAllNumbersBetweenLimt();
	}
}