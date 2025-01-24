import java.util.*;
public class FibStar
{
	public static void main (String args[])
	{
		System.out.println("Enter the Max length to print fibno");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Solution.fun(num,0,1);
		
	}
}
class Solution
{
	static int count=1;
	public static void fun(int n,int start,int end)
	{
		if(count>n)
		{
			return;
		}
		int sum=start+end;
		System.out.print(sum+" ");
		for(int i=0;i<sum;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		start=end;
		end=sum;
		count++;
		fun(n,start,end);
		
	}
}
	