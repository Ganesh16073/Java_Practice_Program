package com.question;
import java.util.*;
public class Question_15 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal");
		float p=sc.nextFloat();
		System.out.println("Enter the time period");
		float t=sc.nextFloat();
		System.out.println("Enter the Rate of intrest");
		float r=sc.nextFloat();
		int count=0;
		float s=1;
		while(count!=t)
		{
			s=s*(1+r/100);
			count++;
		}
		float ci=p*s;
		System.out.println("Compound interst is "+ci);
	}

}
