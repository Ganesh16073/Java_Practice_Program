package com.section1;

import java.util.Scanner;

public class EmployeeMain {

	static Scanner sc=new Scanner(System.in);
	public static void employeeSalary(Employee[] emp)
	{
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee id =>> "+emp[i].getEid()+" Employee Salary is =>> "+emp[i].calculateFinalSalary());
		}
		
	}
	
	public static void managersalary(Manager[] man)
	{
		for(int i=0;i<man.length;i++)
		{
			System.out.println("Manager id =>> "+man[i].getEid()+" Manager Salary is =>> "+man[i].calculateFinalSalary());
		}
	}
	
	public static void internsalary(Intern[] in)
	{
		for(int i=0;i<in.length;i++)
		{
			System.out.println("Intern id =>> "+in[i].getEid()+" Intern Salary is =>> "+in[i].calculateFinalSalary());
		}
	}
	public static void main(String[] args) {
		
		Employee[] emp=new Employee[5];
		System.out.println("Enter the 5 Employee Data");
		emp[0]=new Employee(1,"Ram",20000);
		emp[1]=new Employee(2,"shyam",30000);
		emp[2]=new Employee(3,"munna",25000);
		emp[3]=new Employee(4,"raja",28000);
		emp[4]=new Employee(5,"don",22000);
		
		Manager[] man=new Manager[5];
		man[0]=new Manager(11,"ravi",50000,3000);
		man[1]=new Manager(12,"ravi",22000,3000);
		man[2]=new Manager(13,"ravi",40000,3000);
		man[3]=new Manager(14,"ravi",30000,3000);
		man[4]=new Manager(15,"ravi",60000,3000);
		
		Intern[] in=new Intern[5];
		in[0]=new Intern(21,"Preeti",5000,3);
		in[1]=new Intern(22,"prtik",3000,3);
		in[2]=new Intern(23,"Kapil",6000,3);
		in[3]=new Intern(24,"dhruv",2000,3);
		in[4]=new Intern(25,"john",7000,3);
		
		System.out.println("Employee Final salary is :");
		employeeSalary(emp);
		System.out.println();
		
		System.out.println("Manager Salary is");
		managersalary(man);
		System.out.println();
		
		System.out.println("Intern Salary is");
		internsalary(in);
		
	}
}
