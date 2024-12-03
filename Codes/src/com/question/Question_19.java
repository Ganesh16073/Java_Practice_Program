package com.question;
import java.util.*;
public class Question_19 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total candies");
		int cand=sc.nextInt();
		System.out.println("Enter the  number of candies to buy");
		int buy=sc.nextInt();
		System.out.println("Now the total candie available is "+(cand=cand-buy));
		System.out.println("the total candies sold is "+buy);
		
	}
}
