package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qestion_1 {
	
	public static List<String> extractPalindromes(String input) {
        List<String> palindromes = new ArrayList<>();

        
        String[] words = input.split(" ");

        for (String word : words) {
            
            StringBuilder cleanedWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    cleanedWord.append(c);
                }
            }

            String cleanedString = cleanedWord.toString();

            if (!cleanedString.isEmpty() && isPalindrome(cleanedString)) {
                palindromes.add(cleanedString);
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String ");
//    	String str=sc.nextLine();
        String str = "Wow, this is a radar and level test. Madam!";

        List<String> palindromes = extractPalindromes(str);

        System.out.println("Palindrome words:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }
}