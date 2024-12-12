package com.que2;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private  double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	public void displayDetails(Employee emp)
	{
		System.out.println("id => "+emp.getId()+"\t name => "+emp.getName()+"\t Designation => "+emp.getDesignation()+"\t Salay => "+emp.getSalary());
	}
	
	public void applyBonus(Employee emp)
	{
		System.out.println("Enter the Choice");
		System.out.println("1: Excelent");
		System.out.println("2: Good");
		System.out.println("3: Average");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			try
			{
				double old=emp.getSalary();
				double salary=emp.getSalary();
				salary=salary*20/100;
				emp.setSalary(old+salary);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
		case 2:
			try
			{
				double old=emp.getSalary();
				double salary=emp.getSalary();
				salary=salary*10/100;
				emp.setSalary(old+salary);
				displayDetails(emp);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
		case 3:
			try
			{
				double old=emp.getSalary();
				double salary=emp.getSalary();
				salary=salary*5/100;
				emp.setSalary(old+salary);
				displayDetails(emp);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			break;
			default:
				System.out.println("Invalid Choice bonus cannot applied");

		}
	}
	
	
}
