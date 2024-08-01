import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
}
class Company
{
	private Employee emp;
	void addNewEmployee(Employee ep)
	{
		emp=ep;
	}
	void showEmployee()
	{
		System.out.println(emp.getName()+"\t"+emp.getId()+"\t"+emp.getSal());
	}
}
public class CompanyApplication
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int id,sal;
	String name;
	System.out.println("Enter the Id To add");
	id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Name To add");
	name=sc.nextLine();
	System.out.println("Enter the Salary To add");
	sal=sc.nextInt();
	
	Employee em=new Employee();
	em.setId(id);
	em.setName(name);
	em.setSal(sal);
	
	Company c=new Company();
	c.addNewEmployee(em);
	c.showEmployee();
	}
}