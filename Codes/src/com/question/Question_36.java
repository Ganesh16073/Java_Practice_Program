package com.question;
import java.util.*;
public class Question_36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String first="abc";
		String second="def";
		String third="dabecf";
		char[] ch=third.toCharArray();
		
		if(first.length()+second.length()!=third.length()) {
			System.out.println("Not a Valid Shuffle");	
		}
		else
		{
			for(int i=0;i<first.length();i++)
			{
				for(int j=0;j<ch.length;j++)
				{
					if(first.charAt(i)==ch[j])
					{
						ch[j]=0;
					}
					
				}
			}
			
			for(int i=0;i<second.length();i++)
			{
				for(int j=0;j<ch.length;j++)
				{
					if(second.charAt(i)==ch[j])
					{
						ch[j]=0;
					}
					
				}
			}
			boolean flag=true;
//			for(int i=0;i<ch.length;i++)
//			{	
//				System.out.print(ch[i]+" ");
//			}
			
			
			for(int i=0;i<ch.length && flag==true ;i++)
			{
				if(ch[i]!=0)
				{
					System.out.println("Not valid Shuffel");
					flag=false;
				}
				
			}
			if(flag==true)
			{
				System.out.println("Valid Shuffel");
			}
		}
	}
}
