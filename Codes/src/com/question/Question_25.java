package com.question;
import java.util.*;
public class Question_25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int oddIncrement = 7;  // Increment for odd-indexed terms
        int evenIncrement = 6; // Increment for even-indexed terms
        int oddTerm = 0;       // Starting term for odd positions
        int evenTerm = 0;      // Starting term for even positions
        int term = 0;
        int n;
        System.out.println("Enter the N thn Number to find");
        n=sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // Odd-indexed term
                term = oddTerm;
                oddTerm += oddIncrement;  // Increment for the next odd term
            } else {
                // Even-indexed term
                term = evenTerm;
                evenTerm += evenIncrement;  // Increment for the next even term
            }
        }
		System.out.println(term);
	}
}
