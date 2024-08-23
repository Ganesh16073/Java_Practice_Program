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
public class EmployeeApp
{
	public static void main(String args[])
	{
		int id,sal,size;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of employee to add");
		size=sc.nextInt();
		Employee emp[]=new Employee[size];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			System.out.println("Enter the id Of employee");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name Of employee");
			name=sc.nextLine();
			System.out.println("Enter the Salary Of employee");
			sal=sc.nextInt();
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setSal(sal);
			
		}
		System.out.println("Display Of Employee");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Id: "+emp[i].getId()+"\tName: "+emp[i].getName()+"\tSal: "+emp[i].getSal());
		}
		
	}
}
