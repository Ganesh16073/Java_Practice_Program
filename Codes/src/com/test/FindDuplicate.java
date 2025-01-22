package com.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicate {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String");
//		String str=sc.nextLine();
		
		String str="ganesh kulkarni is a developer";
		Map<Character, List<Integer>> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				ArrayList<Integer> li=(ArrayList<Integer>) map.get(ch);
				li.add(i);
			}
			else
			{
				ArrayList<Integer> li=new ArrayList<>();
				li.add(i);
				map.put(ch, li);
			}
		}
		
		System.out.println("The Duplicate character in a string are");
		map.forEach((key,value)->{
			char ch=key;
			ArrayList<Integer> list=(ArrayList<Integer>) value;
			if(list.size()>1)
			{
				System.out.println("Duplicate Character => "+key+", and their duplicate index are => "+list);
			}
		});
	}

}
