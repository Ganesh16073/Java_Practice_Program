package com.question;
import java.util.*;
public class Question_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int wamt,bamt;
		System.out.println("Enter the amount to withdraw");
		wamt=sc.nextInt();
		System.out.println("Enter the accoubnt balence");
		bamt=sc.nextInt();
		
		if(wamt<=(bamt-0.50) && bamt>=0 && wamt%5==0)
		{
			System.out.println(bamt-wamt-0.5);
		}
		else if(wamt%5==0)// incorrect withdraw amount , not multiple of 5
		{
			System.out.println(bamt);
		}
		else if(bamt>wamt+0.50)// insufficent ballence
		{
			System.out.println(bamt);
		}
	}
}
