import java.util.*;
import java.io.*;
public class FileDigitSymbolAlphabet
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=new String();
		str=sc.nextLine();
		
		FileWriter fw=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\stringdata.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(str);
		bw.close();
		fw.close();
		
		FileReader fr=new FileReader("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\stringdata.txt");
		int data;
		while((data=fr.read())!=-1)
		{
			if((data>=65 && data <=90) || (data>=97 && data<=122))
			{
				FileWriter fwa=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\alphabet.txt",true);
				BufferedWriter bwa=new BufferedWriter(fwa);
				char ch=(char)data;
				bwa.write(ch);
				bwa.close();
			}
			else if((data>=48 && data<=57))
			{
				FileWriter fwd=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\Digit.txt",true);
				BufferedWriter bwd=new BufferedWriter(fwd);
				char ch=(char)data;
				bwd.write(ch);
				bwd.close();
			}
			else
			{
				FileWriter fws=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\File_Handlinng\\Symbole.txt",true);
				BufferedWriter bws=new BufferedWriter(fws);
				char ch=(char)data;
				bws.write(ch);
				bws.close();
			}
			
		}
	}
}
