import java.util.*;
import java.io.*;
public class FileOperations
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the Choice to Perform the Operation");
		System.out.println("1: Write a Java program to create a file and write contents, save and close the file.");
		System.out.println("2: Write a Java  program to read file contents and display on console.");
		System.out.println("3: Write a Java  program to read numbers from a file and write even, odd and prime numbers to separate file.");
		System.out.println("4: Write a Java  program to append content to a file.");
		System.out.println("5: Write a Java  program to compare two files.");
		System.out.println("6: Write a Java program to copy contents from one file to another file.");
		System.out.println("7: Write a Java  program to merge two file to third file.");
		System.out.println("8: Write a Java  program to count characters, words and lines in a text file.");
		System.out.println("9: Write a Java  program to remove a word from text file.");
		System.out.println("10: Write a Java  program to remove specific line from a text file.");
		System.out.println("11: Write a Java  program to remove empty lines from a text file.");
		System.out.println("12: Write a Java  program to find occurrence of a word in a text file.");
		
		int choice;
		Scanner sc=new Scanner(System.in);
		do{
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println(" To create a file and write contents, save and close the file.");
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
				FileWriter fw=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox");//(path,true) will append
				System.out.println("Enter the Data to add or overRide in file");
				sc.nextLine();
				String data=sc.nextLine();
				fw.write(data);
				System.out.println("Data Inserted Sucessfull..........");
				fw.close();
				FileInputStream fis=new FileInputStream("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox");
				System.out.println();
				int i=0;
				System.out.println("The Data from File is...........................");
				while((i=fis.read())!=-1)
				{
					System.out.println((char)i);
				}
				break;
			
			case 2:
				System.out.println(" Reading file contents and display on console.");
				FileReader frd=new FileReader ("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox");
				System.out.println();
				i=0;
				System.out.println("The Data from File is...........................");
				while((i=frd.read())!=-1)
				{
					System.out.println((char)i);
				}
				break;
				
			case 3:
				System.out.println("Write a Java  program to read numbers from a file and write even, odd and prime numbers to separate file.");
				FileReader fr=new FileReader("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox");
				System.out.println();
				System.out.println("The odd and Even Number fro File is ==> ");
				i=0;
				while((i=fr.read())!=-1)
				{
					if(i>48 && i<57 && i%2==1)
					{
						System.out.println("Odd Number ==> "+(char)i);
					}
					if(i>48 && i<57 && i%2==0)
					{
						System.out.println("Even Number ==> "+(char)i);
					}
				}
				System.out.println();
				break;
				
			case 4:
				System.out.println("4: Write a Java  program to append content to a file.");
				File af=new File("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox");
				if(af.exists())
				{
					System.out.println("File Already Exists");
				}
				else
				{
					boolean b=af.createNewFile();
					if(b)
					{
						System.out.println("New File Is Created");
					}
					else
					{
						System.out.println("File Is Already Created or some Problem is there");
					}
				}
				FileWriter fww=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\case1.dox",true);
				sc.nextLine();
				data=sc.nextLine();
				fww.write(data);
				System.out.println("Appended Sucessful");
				
			
			default :
				System.out.println("Invalid choice");
		}
		System.out.println("Enter Choices to continue Or Enter 0 to exit");
		}while(choice!=0);
	}
}