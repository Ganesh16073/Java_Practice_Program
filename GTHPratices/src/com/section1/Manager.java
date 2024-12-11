package com.section1;

public class Manager extends Employee{

	private int mid;
	private String mname;
	private double salary;
	private double bonus;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", mname=" + mname + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	public Manager(int mid, String mname, double salary, double bonus) {
		this.mid = mid;
		this.mname = mname;
		this.salary = salary;
		this.bonus = bonus;
	}
	public Manager() {
		
	}
	public double calculateFinalSalary()
	{
		return salary+bonus;
	}
	
}
