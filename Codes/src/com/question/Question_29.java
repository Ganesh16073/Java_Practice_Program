package com.question;
import java.util.*;
public class Question_29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to find odd digit and even digit difference");
		int n=sc.nextInt();
		int temp=n,rem;
		int oddsum=0,evensum=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			if(rem%2==1)
			{
				oddsum+=rem;
			}
			else if(rem%2==0)
			{
				evensum+=rem;
			}
			temp/=10;
		}
		if(oddsum>evensum)
		{
			System.out.println((oddsum-evensum));
			
		}
		else
		{
			System.out.println((evensum-oddsum));

		}
	}
}
