package com.section1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProductApp1 {
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
			return true;
			
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
	
	public void findHigestStock(List<Product> p)
	{
		Optional<Product> max=p.stream().max(Comparator.comparingInt(pr -> pr.getPrice()));
		max.ifPresent(pro-> System.out.println(pro));
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<>();
		list.add(new Product(1, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(2, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(3, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(4, "Harry Potter", 200, 1,  "Book"));
		list.add(new Product(5, "Harry Potter", 200, 1,  "Book"));
		
		
		
		
	}

}
