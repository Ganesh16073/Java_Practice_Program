package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueWords {
	public static void main(String[] args) {
		String st="Your code has a logical issue: you are overwriting sum during each iteration instead of accumulating the binary result. Instead, you need to append the binary digits to sum by adding them in their proper place (based on powers of 10). Here's the corrected version of your code:";
		
		Map<String,Integer> m=new LinkedHashMap<>();
		String[] str=st.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(m.containsKey(str[i]))
			{
				m.put(str[i], m.get(str[i])+1);
			}
			else
			{
				m.put(str[i],1);
			}
		}
		System.out.println(m);
		
	}

}
