package com.question;
import java.util.*;
public class Question_20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight ");
		int weight=sc.nextInt();
		if(weight>0 && weight<=2000)
		{
			System.out.println("Time Estimated : 25 Minutes");
		}
		else if(weight>2000 && weight<=4000)
		{
			System.out.println("Time Estimated : 35 Minutes");
		}
		else if(weight>4000 && weight<=7000)
		{
			System.out.println("Time Estimated : 45 Minutes");
		}
		else if(weight>7000)
		{
			System.out.println("Machine Overload");
		}
		else if(weight==0)
		{
			System.out.println("Time Estimated : 0	 Minutes");
		}
		else
		{
			System.out.println("Invalid innput");
		}
	}
}
