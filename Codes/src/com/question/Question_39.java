package com.question;
import java.util.*;
public class Question_39 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of string array");
		int size=sc.nextInt();
		String str[]=new String[size];
		System.out.println("Enter the Sting");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
			System.out.println("Enter the  Next Sting");
		}
		System.out.println("Before Sort using length");
		for(int i=0;i<str.length;i++)
		{
			System.out.println("the Sting is "+str[i]);
		}
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()>str[j].length())
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("After Sort");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+", ");
		}
		
	}

}
