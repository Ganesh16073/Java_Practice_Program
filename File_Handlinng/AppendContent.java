import java.util.*;
import java.io.*;
public class AppendContent
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("4: Write a Java  program to append content to a file.");
				File f=new File("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox");
				if(f.exists())
				{
					System.out.println("File Already Exists");
				}
				else
				{
					boolean b=f.createNewFile();
					if(b)
					{
						System.out.println("New File Is Created");
					}
					else
					{
						System.out.println("File Is Already Created or some Problem is there");
					}
				}
				FileWriter fw=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox",true);//(path,true) will append
				System.out.println("Enter the Data to add or overRide in file");
				String data=sc.nextLine();
				fw.write(data);
				System.out.println("Data Inserted Sucessfull..........");
				fw.close();
	}
}