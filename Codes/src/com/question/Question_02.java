package com.question;
import java.util.*;
public class Question_02 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int count=0;
	
	for(int i=0;i<size;i++)
	{
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x<y)
		{
			count=0;
			while(x!=y)
			{
				x++;
				count++;
			}
			System.out.println(count);
		}
		else if(x>y)
		{
			count=0;
			while(x!=y)
			{
				x--;
				count++;
			}
			System.out.println(count);
		}
		else
		{
			System.out.println(0);
		}
	}
}
	
}
