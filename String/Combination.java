package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Combination {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		System.out.println("Enter the String to find combination");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the number of Contionus sequence to find combination");
		int n=sc.nextInt();
		if(n>str.length())
		{
			System.out.println("Combination greater than string length");
		}
		else
		{
			for(int i=0,j=i+n;i<str.length()&& j<=str.length();i++,j++)
			{
				a=Solution.getPermutation("", str.substring(i, j));
				
			}
		}
		System.out.println("The Conbination are => "+a);
		System.out.println("And Count is =>> "+Solution.count);

//		
//		HashSet<String> set=new HashSet<>(a);
//		System.out.println("The Remover duplicat are => "+set);
//		System.out.println("The Count is => "+set.size());
	}

}
