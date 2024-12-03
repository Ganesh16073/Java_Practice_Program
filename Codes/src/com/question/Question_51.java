package com.question;
import java.util.*;
public class Question_51 {
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
		int presum=0;
		int sum=0;
		int first=-1;
		int second=-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(presum==0)
				{
					presum=sum;
				}
				if(sum>0 && sum<presum)
				{
					presum=sum;
					first=a[i];
					second=a[j];
				}
				else if(sum<0 && (-sum)<presum)
				{
					
					presum=-sum;
					first=a[i];
					second=a[j];
				}
			}
		}
		System.out.println("The Sum: "+presum+"is closer to 0 with the value is "+first+" and "+second);
	}
}
