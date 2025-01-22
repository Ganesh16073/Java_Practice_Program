package com.test;

import java.util.Scanner;

public class DycApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int s1=sc.nextInt();
		int []a=new int[s1];
		System.out.println("Enter the Element of First array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of Second array");
		int s2=sc.nextInt();
		int []b=new int[s2];
		System.out.println("Enter the Element of First array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Choice");
		System.out.println("1: to perform Mege operation");
		System.out.println("2: to perform union operation");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			
		}
		
	}

}
