package com.question;
import java.util.*;
public class Question_44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter  the Sum to find");
		int tsum=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==tsum)
				{
					System.out.println("index is "+i+", "+j+" and value is "+a[i]+", "+a[j]);
				}
			}
		}
	}
}
