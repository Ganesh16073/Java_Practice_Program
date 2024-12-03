package com.question;
import java.util.*;
public class Question_41 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		ArrayList<Integer> odd=new ArrayList<>();
		ArrayList<Integer> even=new ArrayList<>();
		
		
		System.out.println("Enter the Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				odd.add(a[i]);
			}
			else
			{
				even.add(a[i]);
			}
		}
		System.out.println("Even Number are "+even);
		
		System.out.println("Odd Number is "+odd);
		
	}
}
