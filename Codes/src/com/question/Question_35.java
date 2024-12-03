package com.question;
import java.util.*;
public class Question_35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  String To check Palindrome string");
		String str=sc.nextLine();
		boolean flag=true;
		for(int i=0,j=str.length()-1;i<str.length()/2 && flag==true;i++,j--)
		{
			if(str.charAt(i)!=(str.charAt(j)))
			{
				System.out.println("Not a palindrome");
				flag=false;
			}
		}
		if(true)
		{
			System.out.println("It Is a Palindrome");
		}
		
	}
}
