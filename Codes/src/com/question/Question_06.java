package com.question;
import java.util.*;
public class Question_06 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Number of student to wish to join");
			int wish=sc.nextInt();
			System.out.println("Capacitybof batch");
			int cap=sc.nextInt();
			System.out.println("Already registed student");
			int aldy=sc.nextInt();
			
			if((wish+aldy)<=cap)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		
		
		
	}
}
