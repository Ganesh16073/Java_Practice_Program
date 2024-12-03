package com.question;
import java.util.*;
public class Question_22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the yeay to check Leap Year");
		int year=sc.nextInt();
		if(year%4==0 || year%100==0||year%400==0)
		{
			System.out.println("It is Leap Year");
		}
		else
		{
			System.out.println("It is Not LeapYear");
		}
	}
}
