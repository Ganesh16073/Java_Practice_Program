package com.question;
import java.util.*;
public class Question_38 { // logic to found

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String which you want tocheck Longest Palindrome");
		String str=sc.next();
		int count=0,precount=0;
		int start=-1,end=-1;
		for(int i=0;i<str.length();i++)
		{
			count=0;
			for(int j=i,k=(str.length()-1)-i ;j<str.length()/2 ;j++,k--)
			{
				
				if(str.charAt(j)==(str.charAt(k)))
				{
					count++;
//					System.out.println("Not a palindrome");
				}
				
				if(count>precount)
				{
					start=j-1;
					end=(str.length()-2)-i;
					precount=count;
				}
			}
		}
		
		for(int i=start;i<end;i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
}
