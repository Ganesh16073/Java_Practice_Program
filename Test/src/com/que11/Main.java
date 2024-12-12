package com.que11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,HashMap<String,ArrayList<Student>>> map=new HashMap<>();
		//      dep             cour          stu
		
		ArrayList<Student> stu=new ArrayList<>();
		stu.add(new Student("Ganesh", 10));
		stu.add(new Student("Ram", 10));
		stu.add(new Student("Sham", 10));
		stu.add(new Student("Don", 10));
		stu.add(new Student("dhruv", 10));
		
		HashMap<String, ArrayList<Student>> course= new HashMap<String, ArrayList<Student>>();
		course.put("Java", stu);
		course.put("Dot Net", stu);
		course.put("Php", stu);
		
		map.put("Computer", course);
		
		System.out.println("Enter the choice");
		System.out.println("1: Add Course");
		System.out.println("2:Enrole Student");
		System.out.println("3: Get Grades of course and department");
		System.out.println("4: Average Grade of cource");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Add Course");
			System.out.println("Enter the Course Name");
			sc.nextLine();
			String coursName=sc.nextLine();
			course.put(coursName, null);
			break;
		case 2:
			System.out.println("Enter the Studen name");
			String name=sc.next();
			System.out.println("Enter the Grade");
			double gr=sc.nextDouble();
			System.out.println("Enter the Cource");
			String courseN=sc.next();	
			System.out.println("Enter the Depart name");
			String DptName=sc.next();
			
			Student s=new Student(name,gr);
			
			course.put(courseN,(ArrayList<Student>) Arrays.asList(s));
			map.put(DptName, course);
			break;
		case 3:
			System.out.println("the grade of dep and course are");
			map.forEach((departments,courses)->
			{
				System.out.println(departments);
				Set<String> st=courses.keySet();
				for(String key: st)
				{
					System.out.println(key);
					ArrayList<Student> li=course.get(key);
					li.forEach(l-> System.out.println(l.getGrade()));
					
				}
			});
			break;
//		case 4:
//			map.forEach((departments,courses)->
//			{
//				Set<String> st=courses.keySet();
//				for(String key: st)
//				{
//					ArrayList<Student> li=course.get(key);
//					int sum=0;
//					
//					Iterator<Student> ir=li.iterator();
//					i
//				}
//			});
		}
		
		
		
	}
}
