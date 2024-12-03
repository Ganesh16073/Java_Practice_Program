package com.string;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		System.out.println("Enter the Number to find the binary number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int count=1;
		while(num!=0)
		{
			int rem=num%2;
			sum+=rem*count;
			num/=2;
			count*=10;
			
		}
		
		System.out.println("Binary number is => "+sum);
	}

}
