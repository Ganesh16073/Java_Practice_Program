package com.question;
import java.util.*;
public class Question_23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][];
		System.out.println("Enter the number rows");
		int row=sc.nextInt();
		System.out.println("Enter the Number of colun");
		int col=sc.nextInt();
		a=new int[row][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int max=0;
		int ind=-1;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==1)
				{
					++count;
				}
				
				if(max<count)
				{
					max=count;
					ind=i;
				}
			}
		}
		System.out.println("The "+(ind+1)+" row has most  1 is "+count);
			
		
	}
}
