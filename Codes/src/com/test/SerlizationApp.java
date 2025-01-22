package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlizationApp {

	public static void main(String[] args) throws IOException, Exception {
		
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Ganesh");
		emp.setSal(50000);
		
		FileOutputStream f=new FileOutputStream("C:\\Users\\Ganesh\\Desktop\\textfile.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(emp);
		System.out.println("Employee data is stored in file");
		o.close();
		f.close();
		FileInputStream fi=new FileInputStream("C:\\Users\\Ganesh\\Desktop\\textfile.txt");
		ObjectInputStream of=new ObjectInputStream(fi);
		
		Object obj=of.readObject();
		if(obj!=null)
		{
			System.out.println();
			System.out.println("The Decoded object is ");
			Employee e=(Employee) obj;
			System.out.println(e);
		}
		else
		{
			System.out.println("Data not found ");
		}
		
		of.close();
		fi.close();
		
	}
}
