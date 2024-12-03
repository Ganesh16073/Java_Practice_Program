package com.question;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList<Object> l=new ArrayList<>();
		l.add(1);
		l.add(true);
		l.add("Try");
		l.forEach(n-> System.out.println(n));
	}

}
