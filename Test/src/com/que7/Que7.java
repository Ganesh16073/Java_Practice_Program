package com.que7;

import java.util.Scanner;

public class Que7 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		 Box<Integer> b=new Box<>();
		 boolean validAdd=false;
		
		 while(!validAdd)
		 {
			 System.out.println("Enter choice ");
			 System.out.println("1: AddEnter choice ");
			 System.out.println("2: Next method ");
			 int choice =sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter the Number to add");
					int num=sc.nextInt();
					 b.setMethod(num);
					break;
			 case 2:
				 validAdd=true;
				 break;
				 default:
					 System.out.println("Invalid choice");
			 }
			 
		 }
		
		 b.getMethod();
		
	}

}
