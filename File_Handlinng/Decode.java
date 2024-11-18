import java.util.*;
import java.io.*;
public class Decode
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\serializable.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object obj=ois.readObject();
		if(obj!=null)
		{
			Data d=(Data)obj;
			System.out.println("Id => "+d.getNo()+"\nString is =>"+d.getName());
		}
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
