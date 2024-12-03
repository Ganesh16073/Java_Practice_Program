package com.question;
import java.util.*;
public class Question_49 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int flag=1,small=-1;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1]&& small==-1;j++)
			{
				small=j;
				System.out.println("Smallest value is "+small);
			}
		}
	}
}
