package com.question;
import java.util.*;
public class Question_52 {

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
		System.out.println("Enter the Target sum to find");
		int tsum=sc.nextInt();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum+=a[j];
				if(sum==tsum)
				{
					System.out.print("[ "+i+", "+j+" ]{--------{ ");
					for(int k=i;k<=j;k++)
					{
						System.out.print(a[k]+" ");
					}
					System.out.print("}");
					System.out.println();	
				}
			}
			
		}
	}
}
