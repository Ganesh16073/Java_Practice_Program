package com.question;
import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the equal number of row an coloum");
		int n=sc.nextInt();
		
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				int top=i;
				int left=j;
				int right=(2*n-2)-j;
				int down=(2*n-2)-i;
				int a=Minimum.min(top, down);
				int b=Minimum.min(left, right);
				int result=Minimum.min(a, b);
				System.out.printf("%d ",(n-result));
				
				
			}
			System.out.println();
		}
	}
}
class Minimum
{
	public static int min(int a,int b)
	{
		 int x=-1;
		    if(a<b)
		    {
		        x=a;
		    }
		    else if(b<a)
		    {
		        x=b;
		    }
		    else if(a==b)
		    {
		        x=a;
		    }
		    return x;
	}
}
