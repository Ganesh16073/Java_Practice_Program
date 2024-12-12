package com.que2;

import java.util.Scanner;

public class EmpApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the id");
//		int id=sc.nextInt();
//		System.out.println("Enter the NAme");
//		sc.nextLine();
//		String name=sc.nextLine();
//		System.out.println("Enter the Designation");
//		String Des=sc.nextLine();
//		System.out.println("Enter the salary");
//		double sal=sc.nextDouble();
//		Employee empl=new Employee(id, name,Des,sal);
		
		Employee emp=new Employee(1,"Ganesh","Developer",30000);
		System.out.println();
		
		emp.displayDetails(emp);
		
		emp.applyBonus(emp);
	}
}
