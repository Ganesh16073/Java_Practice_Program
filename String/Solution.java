package com.string;

import java.util.ArrayList;

public class Solution {

	static int count=0;
	static ArrayList<String> al=new ArrayList<>();
	public static ArrayList<String> getPermutation(String p,String up)
	{
		if(up.isEmpty())
		{
			count++;
			al.add(p);
			return al;
		}
		char ch=up.charAt(0);
		
		for(int i=0;i<=p.length();i++)
		{
			String f=p.substring(0, i);
			String s=p.substring(i,p.length());
			
			getPermutation(f+ch+s,up.substring(1));
			
		}
		
		
		
		
		return al;
	}
}
