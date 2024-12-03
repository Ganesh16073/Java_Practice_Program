package com.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		System.out.println("Enter the String to Find Permutation");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		ArrayList<String> al=Solution.getPermutation("", s);
		System.out.println(al);
	}

}
