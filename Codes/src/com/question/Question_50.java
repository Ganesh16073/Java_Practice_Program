package com.question;
import java.util.*;
public class Question_50 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int max=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(i==(a.length-2) && j==(a.length-1))
				{
					System.out.println("The "+max+" Next Greater value is "+(-1));
					break;
				}
				if(max<a[j])
				{
					System.out.println("The "+max+" Next Greater value is "+a[j]);
					break;
				}
				
			}
		}
	}
}
