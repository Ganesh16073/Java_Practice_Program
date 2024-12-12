package com.que3;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	static List<Book> list=new ArrayList<>();
	
	public void addBook(Book book)
	{
		if(list.add(book))
		{
			System.out.println("Book Added");
		}
		else
		{
			System.out.println("Book not added");
		}
	}
	
	public void searchByTitle(String title)
	{
		list.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).forEach(bk-> System.out.println(bk));
		System.out.println();
		System.out.println("If Dont see any Book Means No book available");
		System.out.println();
	}
	public void searchByAuthor(String author)
	{
		list.stream().filter(b -> b.getAuthor().equalsIgnoreCase(author)).forEach(bk-> System.out.println(bk));
		System.out.println();
		System.out.println("If Dont see any Book Means No book available");
		System.out.println();
	}
	
	public void displayBooks()
	{
		System.out.println("All books are =>>");
		list.forEach(b-> System.out.println(b));
	}

}
