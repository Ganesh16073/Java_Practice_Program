package com.section1;

public class Intern extends Employee{
	private int mid;
	private String mname;
	private double salary;
	private int dur;
	@Override
	public String toString() {
		return "Intern [mid=" + mid + ", mname=" + mname + ", salary=" + salary + ", dur=" + dur + "]";
	}
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
	public int getDur() {
		return dur;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	public Intern( int mid, String mname, double salary, int dur) {
		this.mid = mid;
		this.mname = mname;
		this.salary = salary;
		this.dur = dur;
	}
	public Intern() {
		
	}
	public double calculateFinalSalary()
	{
		return (salary/dur);
	}
	

}
