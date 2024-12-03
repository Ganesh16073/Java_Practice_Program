package com.question;
import java.util.*;

public class Question_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Triangle First Angle");
		int ang1=sc.nextInt();
		System.out.println("Enter the Triangle second Angle");
		int ang2=sc.nextInt();
		System.out.println("Enter the Triangle third Angle");
		int ang3=sc.nextInt();
		
		if((ang1==ang2)&&(ang2==ang3)&&(ang3==ang1))
		{
			System.out.println("IT Is A Eqlaitraial Triange");
		}
		else if((ang1==ang2)||(ang2==ang3)||(ang3==ang1))
		{
			System.out.println("It is Isosles");
		}
		else
		{
			System.out.println("It is Scalen");
		}
	}
}
