import java.util.*;
import java.io.*;
public class PerformSerlization
{
	public static void main(String args[]) throws Exception
	{
		Student s=new Student(1,"Hiiiiiiiii");
		
		FileOutputStream fos=new FileOutputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\November_TestPratices\\StudentData.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Data inserted");
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\November_TestPratices\\StudentData.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student si=(Student)ois.readObject();
		System.out.println(si);
	
	
	}
}
class Student implements Serializable
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "id => "+id+", Name => "+name;
	}
	
}