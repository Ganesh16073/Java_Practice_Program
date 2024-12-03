package com.question;
import java.util.*;
public class Question_33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to Find Peermutation");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
			for(int j=i+1;j<str.length();j++)
			{	
				System.out.print(str.charAt(j)+" ");
			
			}
			System.out.println();
		}
	}
}
