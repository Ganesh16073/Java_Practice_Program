package com.question;
import java.util.*;
public class Question_07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int ciq=sc.nextInt();
			if(((ciq+7)>170)&& ciq<170)
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
