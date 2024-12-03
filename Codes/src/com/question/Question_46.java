package com.question;
import java.util.*;
public class Question_46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100); // Used to give radom Number
		}
		
		System.out.println("Enter the Number of rotation");
		int r=sc.nextInt();
		int count=0;
		while(count!=r)
		{
			int temp=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			count++;
			
		}
		System.out.println("The Rotated Array is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
