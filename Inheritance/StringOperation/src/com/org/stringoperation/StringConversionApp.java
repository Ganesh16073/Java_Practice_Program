package com.org.stringoperation;
import java.util.*;
public class StringConversionApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to perform Operation");
		String str=sc.nextLine();
		System.out.println("Enter The choice");
		System.out.println("1: Convert to Upper Case");
		System.out.println("2: Find Max Repeating Character");
		System.out.println("3: Revers String");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			ConvertToUpper c=new ConvertToUpper();
			c.performOperation(str);
			break;
		case 2:
			MaxRepeatCharacter m=new MaxRepeatCharacter();
			m.performOperation(str);
			break;
		case 3:
			WordRevers w=new WordRevers();
			w.performOperation(str);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
	}

}
