package com.question;
import  java.util.*;
public class Question_42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Index To delete");
		int ind=sc.nextInt();
		for(int i=ind;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("The Deleter array is");
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
		}
	}
}
