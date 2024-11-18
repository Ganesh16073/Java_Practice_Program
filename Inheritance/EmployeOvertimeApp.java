import java.util.*;
class Employee
{
	protected int id;
	protected String name;
	protected double totalWorking;
	protected double salary;
	protected double overTime;
	public void setDetails(int id,String name,double totalWorking, double salary,double overTime)
	{
		this.id=id;
		this.name=name;	
		this.totalWorking=totalWorking;
		this.salary=salary;
		this.overTime=overTime;
	}
	public void displayInformation()
	{
		System.out.println("Employee Id is: "+id);
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee Total Working is: "+totalWorking);
		System.out.println("Employee Salary is: "+salary);
		System.out.println("Employee Over Time is: "+overTime);
	}	
}

class OverTime
{
	void setEmployee(Employee e[])
	{
		
	}
}
public EmployeOvertimeApp
{
	public static void main(String args[])
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employee");
		size=sc.nextInt();
		
	}
}