package Recursion;

public class FunctionRecursion {
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		System.out.println("The Summesion of Number is ");
		System.out.println(sum(3));
		
	}
}
