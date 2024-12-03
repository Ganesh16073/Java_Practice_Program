package com.question;
import java.util.*;
public class Question_26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=1;
		int second=1;
		int firstLogic=2;
		int secondLogic=3;
		int term=0;
		System.out.println("Enter the N th term to find");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				term=first;
				first=first*firstLogic;
				
			}
			if(i%2==0)
			{
				term=second;
				second=second*secondLogic;
				
			}
			
		}
		System.out.println(term);
	}
}
