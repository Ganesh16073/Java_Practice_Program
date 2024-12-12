package com.que6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CollectionString {
	 
	 static Scanner sc=new Scanner(System.in);
	 
	 public static List<String> findSort(List<String> list)
	 {
		 boolean validAdd=false;

			while(!validAdd)
			{
				System.out.println("Enter the Choice");
				System.out.println("1: Add Name");
				System.out.println("2: exit and sort");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the Word not Line");
					String word=sc.next();
					list.add(word);
					break;
				case 2:
					validAdd=true;
					break;
				default: 
						System.out.println("Invalid choice");
				}
			}
			
			Comparator<String> sortByName= (s1,s2)-> s1.compareTo(s2)>0 ?1:s1.compareTo(s2)<0 ?-1:0;
			Collections.sort(list,sortByName);
			return list;
			
			
	 }
	 
	 
	public static void main(String[] args) {		
		System.out.println("Enter the String Words to Sort");
		List<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("banana");
		list.add("grapes");
		list.add("Chery");
	
		list=findSort(list);
		System.out.println("Sorted list is");
		list.forEach(l-> System.out.println(l));
	}

}
