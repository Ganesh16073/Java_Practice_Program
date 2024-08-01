import java.util.*;
class SwapDigit
{
	int no;
	void setValue(int n)
	{
		no=n;
	}
	void getSwapNum()
	{	
		String string=Integer.toString(no);
		string.replace(string.charAt(0),string.charAt((string.length()-1)));
		System.out.println(string);
		
	}
	
}
public class SwapDigitApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		SwapDigit obj=new SwapDigit();
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		obj.setValue(num);
		obj.getSwapNum();
		
		
	}
	
}