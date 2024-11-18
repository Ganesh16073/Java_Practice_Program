import java.util.*;
public class CloneApp
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		System.out.println("Enter the Contact");
		int contact=sc.nextInt();
		
		Student s=new Student();
		s.setDetails(name,id,contact);
		s.getDetails();
		
		System.out.println(" Further Details will be cloned Object Details");
		
		Student cloneObject=(Student)s.clone();
		cloneObject.getDetails();
		
		
		
	}

}
class Student implements Cloneable
{
	String name;
	int id,contact;
	
	public void setDetails(String name,int id,int contact)
	{
		this.name=name;
		this.id=id;
		this.contact=contact;
	}
	
	public void getDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
		System.out.println("Contact is "+contact);
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}