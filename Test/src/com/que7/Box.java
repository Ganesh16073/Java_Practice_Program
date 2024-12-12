package com.que7;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

	List<T> list =new ArrayList<>();
	public void setMethod(T t)
	{
		
		if(list.add(t))
		{
			System.out.println("Data added");
		}
		else
		{
			System.out.println("Not added");
		}
		
	}
	public void getMethod()
	{
		list.forEach(data-> System.out.println(data));
	}
}
