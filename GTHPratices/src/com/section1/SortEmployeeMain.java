package com.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeMain {
	public static void main(String[] args) {
		List<Employee> em=new ArrayList<>();
		em.add(new Employee(1,"Ram",20000));
		em.add(new Employee(2,"shyam",30000));
		em.add(new Employee(3,"munna",25000));
		em.add(new Employee(4,"raja",28000));
		em.add(new Employee(5,"don",22000));
		
		Comparator<Employee> sortByName=( e1, e2)->
		{
			if(e1.getEname().compareTo(e2.getEname())>01)
			{
				return 1;
			}
			else if(e1.getEname().compareTo(e2.getEname())<0)
			{
				return -1;
			}
			else
			{
				return 0;
			}
			
		};
		
		Comparator<Employee> sortBySalary=( e1, e2)->
		{
			if(e1.getSalary()>e2.getSalary())
			{
				return -1;
			}
			else if(e1.getSalary()<e2.getSalary())
			{
				return 1;
			}
			else
			{
				return 0;
			}
			
		};
		
		Collections.sort(em,sortByName);
		System.out.println("Employee Sorted by name are =>");
		em.forEach(e->System.out.println(e));
		System.out.println();
		Collections.sort(em,sortBySalary);
		System.out.println("The Employee Sorted By Salary In descending Order are");
		em.forEach(e->System.out.println(e));
	}

}
