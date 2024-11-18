import java.util.*;
public class SumOFDigit
{
	public static void main(String args[])
	{
		System.out.println("Enter the Integer String");
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
		Integer num=Integer.parseInt(str);
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("The Sum is "+sum);
		
	}
}