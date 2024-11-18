import java.util.*;
public class ComparableApp
{
	public static void main(String args[])
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student(24,"Pratik"));
		list.add(new Student(25,"Santho"));
		list.add(new Student(18,"Raj"));
		list.add(new Student(21,"Ganesh"));
		list.add(new Student(22,"Akhi"));
		
		System.out.println("Before using Comparable ant comparTo() method");
		for(Student s:list)
		{
			System.out.println(s);
		}
		
		Collections.sort(list);
		System.out.println("After using Comparable ant comparTo() method");
		for(Student s:list)
		{
			System.out.println(s);
		}
	}
}
class Student implements Comparable<Student> // implementing Compareable <type>
{
	int age;
	String name;
	Student(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public int compareTo(Student that)
	{
		if(this.age>that.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public String toString()
	{
		return "Student [Age => "+age+" and Name => "+name+"]";
	}
}