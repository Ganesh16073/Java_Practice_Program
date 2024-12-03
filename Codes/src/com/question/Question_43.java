package com.question;
import java.util.*;
public class Question_43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int max=a[0],premax=-1;
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				premax=max;
				max=a[i];
			}
		}
		System.out.println("The Second max is "+premax);
	}
}
