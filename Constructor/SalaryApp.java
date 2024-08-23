import java.util.*;
class Salary
{
	String name;
	int id;
	long contact;
	int presentDates;
	int perDaySalary;
	double salary;
	Salary(String name,int id,long contact,int presentDates,int perDaySalary)
	{
		this.id=id;
		this.contact=contact;
		this.presentDates=presentDates;
		this.perDaySalary=perDaySalary;
	}
	void calculateSalary()
	{
		salary=presentDates*perDaySalary;
	}
	void showSalary()
	{
		System.out.println("The Salary of Employee is : "+salary);
	}
}
public class SalaryApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int id;
		long contact;
		int presentDates;
		int perDaySalary;
		System.out.println("Enter the Name of employee");
		name=sc.nextLine();
		System.out.println("Enter the Id of employee");
		id=sc.nextInt();
		System.out.println("Enter the Contact of employee");
		contact=sc.nextInt();
		System.out.println("Enter the Present Days of employee");
		presentDates=sc.nextInt();
		System.out.println("Enter the Per day salary of employee");
		perDaySalary=sc.nextInt();
		Salary s=new Salary(name,id,contact,presentDates,perDaySalary);
		s.calculateSalary();
		s.showSalary();
	}
}