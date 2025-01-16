package com.section1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
		String s="Ganesh Kulkarni";
		
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		
		System.out.println("The Character and Count is =>> ");
		map.forEach((key,value)->
		{
			System.out.println("The Key is "+key+" And The Count is "+value);
		});
	}
}
