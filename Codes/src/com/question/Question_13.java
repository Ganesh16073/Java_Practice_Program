package com.question;
import java.util.*;
public class Question_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Unit charge to calculate the bill");
		int unit =sc.nextInt();
		double sum=0;
		if(unit<=50 && unit>=0)
		{
			sum=unit*0.5;
		}
		if(unit>50  && unit<=150)
		{
			int temp=unit-50;
			sum=(50*0.50)+(temp*0.75);
		}
		if(unit>150 && unit<=250)
		{
			int temp=unit-150;
			sum=(50*0.50)+(100*0.75)+(temp*1.25);
		}
		if(unit>250)
		{
			int temp=unit-250;
			sum=(50*0.50)+(100*0.75)+(100*1.25)+(temp*1.50);
		}
		if(sum==0) {
			System.out.println("Invalid unit");
			
		}
		else
		{
			System.out.println("The Total Bill is "+(sum+250));
		}
	}
}
