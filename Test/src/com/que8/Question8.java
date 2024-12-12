package com.que8;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Question8 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new Vector<>();
		 boolean validAdd=false;
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);
		 list.add(5);

			while(!validAdd)
			{
				System.out.println("Enter the Choice");
				System.out.println("1: Add Integer");
				System.out.println("2: exit and Iterate");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the Word not Line");
					Integer num=sc.nextInt();
					list.add(num);
					break;
				case 2:
					validAdd=true;
					break;
				default: 
						System.out.println("Invalid choice");
				}
			}
			
			System.out.println();
			System.out.println("======================Front Iteration=========================");
			System.out.println();
			ListIterator<Integer> it=list.listIterator();
			System.out.println("Enter the number to find and delete");
			int num=sc.nextInt();
			System.out.println("Iterating in Forward direction");
			while(it.hasNext())
			{
				if(it.next()==num)
				{
					it.remove();
				}
			}
			System.out.println("Afert Forward iteration");
			list.forEach(i-> System.out.println(i));
			
			System.out.println();
			System.out.println("======================Back Iteration=========================");
			System.out.println();
			
			ListIterator<Integer> r=list.listIterator(list.size());
			System.out.println("Enter the number to find and delete");
			num=sc.nextInt();
			System.out.println("Iterating in Forward direction");
			while(r.hasPrevious())
			{
				if(r.previous()==num)
				{
					r.remove();
				}
			}
			System.out.println("Afert Backward iteration");
			list.forEach(i-> System.out.println(i));
			
	}

}

