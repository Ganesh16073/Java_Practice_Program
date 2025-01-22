package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		ArrayList<Book> list=new ArrayList<>();
//		boolean get=true;
//		while(get)
//		{
//			
//			Scanner sc=new Scanner(System.in);
//			int id=sc.nextInt();
//			String name=sc.next();
//			int price=sc.nextInt();
//			list.add(new Book(id,name,price));
//			System.out.println("Do you want to add book enter : 1 or to exit press any key");
//			int g=sc.nextInt();
//			if(g==1)
//			{
//				get=false;
//			}
//			
//			
//		}
		
		list.add(new Book(4,"Reactjs", 1500));
		list.add(new Book(5,"Redux", 450));
		list.add(new Book(1,"Let Us C", 200));
		list.add(new Book(2,"C++", 2000));
		list.add(new Book(3,"Angular", 900));
		
//		Comparator<Book> sortById=(a,b)-> a.getId()>b.getId()?1:a.getId()<b.getId()?-1:0 ;
		Comparator<Book> sortById=new Comparator<Book>() {
			
			@Override
			public int compare(Book o1, Book o2) {
				if(o1.getId()>o2.getId())
				{
					return 1;
				}
				else if(o1.getId()<o2.getId())
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		};
		
//		Comparator<Book> sortByPrice=(a,b)->a.getPrice()>b.getPrice()?1:a.getPrice()<b.getPrice()?-1:0;
		
		Comparator<Book> sortByPrice=new Comparator<Book>() {
			
			@Override
			public int compare(Book o1, Book o2) {
				if(o1.getPrice()>o2.getPrice())
				{
					return 1;
				}
				else if(o1.getPrice()<o2.getPrice())
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		};
		
		System.out.println("Sorting by Id");
		Collections.sort(list,(a,b)-> a.getId()>b.getId()?1:a.getId()<b.getId()?-1:0);
		list.forEach(System.out::println);
		
		System.out.println("Sorting by Price");
		Collections.sort(list,sortByPrice);
		list.forEach(System.out::println);
	}

}
