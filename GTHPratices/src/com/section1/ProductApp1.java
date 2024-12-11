package com.section1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProductApp1 {
	static List<Product> list=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static boolean addStock()
	{
		try
		{
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			System.out.println("Enter the Product Name");
			sc.nextLine();
			String pname=sc.nextLine();
			System.out.println("Enter the Price ");
			int price=sc.nextInt();
			System.out.println("Enter the Quantity");
			int quantity=sc.nextInt();
			System.out.println("Enter the Category");
			sc.nextLine();
			String categary=sc.nextLine();
			if(list.add(new Product(id,pname,price,quantity,categary)))
			{
				System.out.println("Product added");
				return true;  
			}
			else
			{
				System.out.println("Product not added");
				return false;
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static boolean removeStock(List<Product> p, int id)
	{
		try
		{
			return p.removeIf(pro-> pro.getpId()==id);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void display(List<Product> p,String category)
	{
		p.stream().filter( pro -> pro.getCategory().equalsIgnoreCase(category)).forEach(po -> System.out.println(po));
	
	}
	
	public static void findHigestStock(List<Product> p)
	{
		Optional<Product> max=p.stream().max(Comparator.comparingInt(pr -> pr.getPrice()));
		max.ifPresent(pro-> System.out.println(pro));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		list.add(new Product(1, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(2, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(3, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(4, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(5, "Harry Potter", 200, 1,  "Book"));
		
		System.out.println("Enter the Choice ");
		System.out.println("1: Update or delete product");
		System.out.println("2: Display with Category ");
		System.out.println("3:find Product with higest price");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("1: Enter to add");
			System.out.println("2: Enter to remove");
			int c=sc.nextInt();
			switch(c)
			{
			case 1:
				addStock();
				break;
			case 2:
				try
				{
					System.out.println("Enter the Id to Delete");
					int id=sc.nextInt();
					if(removeStock(list,id))
					{
						System.out.println("Stoct Deletedd");
					}
					else
					{
						System.out.println("Stock not found");
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				break;
				default:
					System.out.println("Invalid Input");
			}
			break;
		case 2:
			try
			{
				System.out.println("Enter the Category ");
				String ca=sc.next();
				display(list,ca);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			findHigestStock(list);
			break;
			default :
				System.out.println("Invalid Choice");
		}
		
		
		
	}

}
