package com.question;
import java.util.*;
public class Question_08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(((str.charAt(i)>=65 && str.charAt(i)<=90))||  (str.charAt(i)>=97 && str.charAt(i)<=122))
			{
				System.out.println("Character");
			}
			else if(str.charAt(i)>=46 && str.charAt(i)<=57)
			{
				System.out.println("Number");
			}
			else
			{
				System.out.println("Symbol");
			}
		}
	}
}
