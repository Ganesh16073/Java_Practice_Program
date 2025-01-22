package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FilterEven {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		if(li.size()>0)
		{
			Stream<Integer> even=li.stream().filter((a)->a%2==0);
			System.out.println("The Even Number are");
			even.forEach(System.out::println);
			
		
		}
		else
		{
			System.out.println("List is Empty");
		}
		
		
	}

}
