package com.question;
import java.util.*;
public class Question_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the credit score");
		int score=sc.nextInt();
		
		if(score>=750 && score>=0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		
	}

}
