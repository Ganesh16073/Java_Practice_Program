package com.question;
import java.util.*;
public class Question_01{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x<y)
			{
				System.out.println("first");
			}
			else if(y<x)
			{
				System.out.println("secont");
			}
			else
			{
				System.out.println("any");
			}
		}
	}
	

}
