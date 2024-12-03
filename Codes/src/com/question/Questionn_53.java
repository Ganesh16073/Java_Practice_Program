package com.question;
import java.util.*;
public class Questionn_53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to find count greater than n/2");
		int f=sc.nextInt();
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=i;j<a.length;j++)
			{
				if(f==a[j])
				{
					count++;
				}
			}	
			if(count>(n/2))
			{
				System.out.println(a[i]+"It is Greater than n/2");
			}
		}
	}
}
