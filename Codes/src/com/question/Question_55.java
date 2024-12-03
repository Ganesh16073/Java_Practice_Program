package com.question;
import java.util.*;
public class Question_55 {

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
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==0)
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				a[a.length-1]=0;
			}
		}
		System.out.println("remove dup");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
