package com.string;

import java.util.Scanner;

public class StringOpperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean running=false;
		while(!running)
		{
			System.out.println("Enter the Choice");
			System.out.println("1: Revers String");
			System.out.println("2: Remove Duplicate");
			System.out.println("3: Check Panindrome");
//			System.out.println("4: Replace SubString");
//			System.out.println("5: Remeove Voules");
//			System.out.println("6: Insert SubString at specific position");
//			System.out.println("7: Convert the Case Upp to Low And Low To Upp");
//			System.out.println("8: Find the First Non-Repeating Character");
//			System.out.println("9: Shift Characters alphabets by n Positions ");
//			System.out.println("10: Count the Frequency of Characters  ");
//			System.out.println("11 Shuffel String  ");
//			System.out.println("12: WAP to input the string and reverse the words of string  ");
//			System.out.println("13: WAP to check Longest Palindrome");
//			System.out.println("14: Enter the String to Find Multiple Of Number example: abc 123 mno 123 ==> 15129 ");
//			System.out.println("15: Find the Longest Word in a Sentence");
//			System.out.println("16: Removing the digit and  symbols in String " );
//			System.out.println("17: Method Chaining " );
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the String");
				sc.nextLine();
				String c1=sc.nextLine();
				StringBuffer clb=new StringBuffer();
				for(int i=c1.length()-1;i>=0;i--)
				{
					clb.append(c1.charAt(i));
				}
				System.out.println("The Revers String is =>> "+clb);
				break;
				
			case 2:
				System.out.println("Enter he String");
				sc.nextLine();
				String sb2=sc.nextLine();
				StringBuffer c2=new StringBuffer(sb2);
				for(int i=0;i<c2.length();i++)
				{
					for(int j=i+1;j<c2.length();j++)
					{
						if(c2.charAt(i)==c2.charAt(j))
						{
							c2.deleteCharAt(j);
							j--;
						}
					}
					
				}
				System.out.println("Duplicated removed String is => "+c2);
				break;
				
			case 4:
				System.out.println("Enter he String to Repalce subbstring at specific index");
				StringBuffer sb=new StringBuffer();
				sc.nextLine();
				sb.append(sc.nextLine());
				System.out.println("Enter the Start index and end index to replace");
				int s=sc.nextInt();
				int e=sc.nextInt();
				System.out.println("Enter the String to add");
				String add=sc.next();
				sb.replace(s, e, add);
				System.out.println("The Replace string is => "+sb);
				break;
				
				
			}
			
		}
		
	}

}
