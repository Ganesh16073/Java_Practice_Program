package com.que3;

import java.util.Scanner;

public class LibApp {

	public static void main(String[] args) {
		Library lb=new Library();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Ente the Choice");
			System.out.println("1: add Boook");
			System.out.println("2: Seach book by title");
			System.out.println("3: Search book by Author");
			System.out.println("4: Display book");
			System.out.println("5: Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				try
				{
					
					System.out.println("Enter the Book Title");
					sc.nextLine();
					String name=sc.nextLine();
					System.out.println("Eter the Author");
					String author=sc.nextLine();
					System.out.println("Enter the ISBN");
					String isbm=sc.nextLine();
					Book b=new Book();
					b.setAuthor(author);
					b.setIsbn(isbm);
					b.setTitle(name);
					lb.addBook(b);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter the Title to find book");
				sc.nextLine();
				String bk=sc.nextLine();
				lb.searchByTitle(bk);
				break;
			case 3:
				System.out.println("Enter the Author to find book");
				sc.nextLine();
				String au=sc.nextLine();
				lb.searchByAuthor(au);
				break;
			case 4:
				lb.displayBooks();
				break;
				
			case 5 : 
				System.exit(0);
				default :
					System.out.println("Invalid Choice");
			}
			
		}
		
	}
}
