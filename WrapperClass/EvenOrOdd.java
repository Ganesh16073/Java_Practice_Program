import java.util.*;
public class EvenOrOdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Number to Check odd Or Even Number");
		String str=sc.next();
		Integer a=Integer.parseInt(str);
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}