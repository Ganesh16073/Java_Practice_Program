package com.question;
import java.util.*;
public class Question_40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		int b[];
		int c[];
		System.out.println("Enter the Size of first Array");
		int size1=sc.nextInt();
		a=new int[size1];
		System.out.println("Enter the Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of second Array");
		int size2=sc.nextInt();
		b=new int[size2];
		System.out.println("Enter the Element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		c=new int[a.length+b.length];
		
		int inc=0;
		for (int i = 0; i < a.length; i++) 
		{
			c[inc]=a[i];
			inc++;
		}
		for (int i = 0; i < b.length; i++) 
		{
			c[inc]=b[i];
			inc++;
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		
		System.out.println("The Merged and decendin order arry is");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
			
		}
	}
}
