package com.question;
import  java.util.*;
public class Question_45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int count=0;
		boolean flag=true;
		for(int i=0;i<a.length&& flag==true;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>(a.length/2))
			{
				System.out.println(a[i]+" Is Major element");
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("No Majaor Element");
		}
	}
}
