package com.que11;

public class Student {

	String name;
	double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public Student() {
		super();
	}
	
}
