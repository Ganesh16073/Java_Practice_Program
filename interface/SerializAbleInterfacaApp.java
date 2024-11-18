import java.util.*;
import java.io.*;
public class SerializAbleInterfacaApp
{
	public static void main(String Args[]) throws IOException, ClassNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id ");
		int id=sc.nextInt();
		System.out.println("Enter the String");
		sc.nextLine();
		String str=sc.nextLine();
		FileA a=new FileA();
		a.setValue(id,str);
		
		// serlizabl
		FileOutputStream fos=new FileOutputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\interface\\serlizabl.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a); // 	 Serializable interface is present in java.io package. It is used to make an object
								//	 eligible for saving its state into a file
		
		FileInputStream fis = new FileInputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\interface\\serlizabl.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        FileA b = (FileA)ois.readObject(); //de-serlizabl
		
		System.out.println(b.i+" "+b.str);
		
		oos.close(); 
        ois.close(); 
	}
}
class FileA implements Serializable
{
	int i;
	String str;
	
	public void setValue(int i, String str)
	{
		this.str=str;
		this.i=i;
	}
}