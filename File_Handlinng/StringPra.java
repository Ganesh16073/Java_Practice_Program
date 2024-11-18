import java.util.*;
import java.io.*;
public class StringPra
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		Data d=new Data(st);
		FileOutputStream fos=new FileOutputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\stringpra.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\stringpra.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		if(obj!=null)
		{
			Data da=(Data)obj;
			System.out.println(da.st);
			fis.close();
			ois.close();
		}
		else
		{
			System.out.println("File not Connected");
		}
		
	}
}
class Data implements Serializable
{
	String st;
	Data(String st)
	{
		this.st=st;
	}
}