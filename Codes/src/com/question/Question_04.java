package com.question;
import java.util.*;
public class Question_04 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int cman;
	int nman;
	System.out.println("Ente the size");
	int size=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter the number og gaurds can manuplicat by xyz");
		cman=sc.nextInt();
		System.out.println("Enter the number of gaurds to manuplicate");
		nman=sc.nextInt();
		
		if(nman<=cman && nman>=0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	
}
}
