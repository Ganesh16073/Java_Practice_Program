package com.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendContent {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to add in File");
		String str=sc.nextLine();
		FileWriter f=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\GTHPratices\\src\\com\\filehandling\\filewrite.txt",true);
		f.write(str);
		System.out.println("Data inserted successfull");
		f.close();
		
		FileReader fd=new FileReader("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\GTHPratices\\src\\com\\filehandling\\filewrite.txt");
		int data;
		while((data=fd.read())!=-1)
		{
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println("File Data Ended");
	}
}
