package com.question;

import java.util.Scanner;

public class Question_28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=0;
		int second=0;
		int firstInc=2;
		int secondInc=1;
		int term=-1;
		
		System.out.println("Enter the N th term to find");
		int n=sc.nextInt();
		for(int i=1;i<=n-2;i++)
		{
			if(i%2==1)
			{
				first+=firstInc;
				term=first;
//				System.out.println(first);
			}
			if(i%2==0)
			{
				second+=secondInc;
				term=second;
//				System.out.println(second);
			}
		}
		System.out.println("The Term Is "+term);
	}
}
