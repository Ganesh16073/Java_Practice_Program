package com.question;
import java.util.*;
public class Question_21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of monkey");
		int n=sc.nextInt();
		System.out.println("Enter the eaten banana by Single Monkey");
		int k=sc.nextInt();
		System.out.println("Enter the eaten Peanuts by single Monkey");
		int j=sc.nextInt();
		System.out.println("Enter the total number of Banana");
		int m=sc.nextInt();
		System.out.println("Enter the Total numbe rof Peanuts");
		int p=sc.nextInt();
		
		int count=1;
		int add=k;
		while(k!=m)
		{
			count++;
			k=k+add;
		}
		n=n-count;
		count=1;
		add=j;
		while(j!=p)
		{
			count++;
			j=j+add;
		}
		n=n-count;
		System.out.println("The Remeinding Monkey is "+n);
		
	}
}
