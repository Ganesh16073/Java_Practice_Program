package com.question;
import java.util.*;
public class Question_18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of vehical");
		int v=sc.nextInt(); //200
		System.out.println("Enter the Total number of wheels");
		int w=sc.nextInt(); //540
		int tw=(4*v-w)/2; //4* 200-520==> 260
		int fw=v-tw; //540-260
		System.out.println("Two wheeler is "+tw);
		System.out.println("Four wheeler is "+fw);
	}
}
