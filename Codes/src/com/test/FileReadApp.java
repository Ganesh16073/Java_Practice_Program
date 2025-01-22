package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileReadApp {
	public static void main(String[] args) throws IOException, Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text to Add");
		String str=sc.nextLine();
		FileWriter fw=new FileWriter("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\Codes\\src\\com\\test\\OrgFile.dox",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(str);
		bw.close();
		fw.close();
		
		FileReader fr=new FileReader("C:\\Program Files\\Java\\jdk-21\\bin\\Java_program\\Codes\\src\\com\\test\\OrgFile.dox");
		BufferedReader br=new BufferedReader(fr);
		int readLine=0;
		while(br.readLine()!="\0")
		{
			readLine++;
		}
		System.out.println("the number of lines are :: "+readLine);
	}

}
