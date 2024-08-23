import java.util.*;
class Employee
{
	private String name;
	private int id;
	private int baseSal;
	private int progress;
	private int incSal=0;
	void setPersonalInfo(String name,int id,int baseSal,int progress)
	{
		this.name=name;
		this.id=id;
		this.baseSal=baseSal;
		this.progress=progress;
	}
	public int incrementalSal()
	{
		if(progress>=60)
		{
			incSal=(baseSal*30)/100;
		}
		return incSal;
	}
	void showDetail()
	{
		System.out.println("Name: "+name+"\tId: "+id+"\tBase Salary: "+baseSal+"\tIncremental Salary: "+incrementalSal());
	}
}
public class EmployeeHikeApp
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int id,sal,progress;
	String name;
	System.out.println("Enter the Name Of employe");
	name=sc.nextLine();
	System.out.println("Enter the ID Of employe");
	id=sc.nextInt();
	System.out.println("Enter the Base Salary Of employe");
	sal=sc.nextInt();
	System.out.println("Enter the Progress Of employe");
	progress=sc.nextInt();
	
	Employee e=new Employee();
	e.setPersonalInfo(name,id,sal,progress);
	e.showDetail();
	}
}