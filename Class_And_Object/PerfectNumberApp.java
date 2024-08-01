import java.util.*;
class Perfect
{
	private int no;
	void setNum(int x)
	{
		no=x;
	}
	boolean findPerfectNumber()
	{
		int temp=no;
		int rem,sum=1;
		while(temp!=0)
		{
			rem=temp%10;
			while(rem==0)
			{
				sum=sum*rem;
				rem--;
			}
			temp=temp/10;
		}
		if(no==sum)
		{
			return true;
		}
		else{
			return false;
		}	
	}
}
public class PerfectNumberApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter the Number to check Perfect Number Or NOt");
		no=sc.nextInt();
		Perfect obj=new Perfect();
		obj.setNum(no);
		boolean result=obj.findPerfectNumber();
		if(result)
		{
			System.out.println("The Number is Perfect Number");
		}
		if(!result)
		{
			System.out.println("The Number is Perfect Number");
		}
	}	
}