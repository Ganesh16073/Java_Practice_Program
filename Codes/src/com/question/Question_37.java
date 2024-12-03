package com.question;
import java.util.*;
public class Question_37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to find most occured character");
		String str=sc.next();
		Solution.findOcc(str);
		
	}
}
class Solution
{
	public static void findOcc(String str)
	{
		int count=0;
		int precount=0;
		char ch,rs='a',pre='a';
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(count>precount)
			{
				precount=count;
				pre=rs;
			}
			
			count=0;
			for(int j=0;j<str.length();j++)
			{
				if(i==j)
				{
					continue;
				}
				if(ch==str.charAt(j))
				{
					count++;
					rs=str.charAt(j);
				}
			}
		}
		System.out.println("the character is "+pre+" and the count is "+precount);
	}
}
