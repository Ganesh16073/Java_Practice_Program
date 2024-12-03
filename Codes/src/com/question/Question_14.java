package com.question;
import java.util.*;
public class Question_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal");
		float p=sc.nextFloat();
		System.out.println("Enter the time period");
		float t=sc.nextFloat();
		System.out.println("Enter the Rate of intrest");
		float r=sc.nextFloat();
		
		float si=(p*r*t)/100;
		System.out.println("The simple inte=rest is "+si);
	}
}
