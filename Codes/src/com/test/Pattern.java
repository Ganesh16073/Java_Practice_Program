package com.test;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Column");
		int n=sc.nextInt();
		int val=1;
		for(int i=1;i<=n;i++)
		{
			val=i;
			for(int j=1;j<=n*2;j++)
			{
				if(j<=10 && j<=i)
				{
					System.out.print(j);
				}
				else if(j>n*2-i && j>10)
				{
					System.out.print(val--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
