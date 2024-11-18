import java.util.*;
import java.io.*;
public class Encoding
{
	public static void main(String args []) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String bu=new String();
		System.out.println("Enter the String");
		bu=sc.nextLine();
		System.out.println("Enter the Id");
		int no=sc.nextInt();
		
		Data d=new Data();
		d.setName(bu);
		d.setNo(no);
		
		FileOutputStream fos=new FileOutputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\serializable.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(d);
		oos.close();
		System.out.println("Sucess");
	}
	
}
class Data implements Serializable
{
	String name;
	int no;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setNo(int no)
	{
		this.no=no;
	}
	public int getNo()
	{
		return no;
	}
}
