import java.util.*;
class Factorial
{
	private static int no;
	void setNum(int x)
	{
		no=x;
	}
	public static int showFactorial()
	{
		int i=1,sum=1;
		while(i!=no)
		{
			sum=sum*no;
			no--;
		}
		return sum;
	}
}
public class FactorialApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter the Number to Find Factorial");
		no=sc.nextInt();
		Factorial obj=new Factorial();
		obj.setNum(no);
		int result=Factorial.showFactorial();
		System.out.println("Factorial is "+result);
	}
}