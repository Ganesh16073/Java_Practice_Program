package Recursion;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Enter the Number to Find The Factorial");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("Factroial of Number is");
		System.out.println(fact(no));
	}

}
