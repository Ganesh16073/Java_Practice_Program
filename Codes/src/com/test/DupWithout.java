package com.test;

public class DupWithout {
	public static void main(String[] args) {
		String str="Ganesh Kulkarni is a Developer";
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					++count;
				}
				if(count >0)
				{
					System.out.println("duplicatchar is :: "+str.charAt(i));
					break;
				}
			}
		}
	}

}
