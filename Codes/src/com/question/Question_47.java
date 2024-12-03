package com.question;
import java.util.*;
public class Question_47 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter element in sorted manner");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp =a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		System.out.println("enter number to find Ceiling");
		int n=sc.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i];j<a[i+1];j++)
			{
				if(j==n && i==(a.length-1))
				{
					System.out.println("Ciel is "+a[a.length-1]);
				}
				else if(j==n)
				{
					System.out.println("Ciel is "+a[i+1]);
				}
			}
		}
		
	}
}
