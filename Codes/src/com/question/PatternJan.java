package com.question;
import java.util.*;
public class PatternJan {
 
	public static void main(String[] args) {
		int a=0;
		boolean flag=true;
		for(int i=1;i<=11;i++)
		{
			if(i>6)
			{
				a=12-i;
			}
			else
			{
				a=i;
			}
			flag=true;
			for(int j=1;j<=11;j++)
			{
				
				if(i<7 && j>=i && j<=12-i && flag==true )
				{
					System.out.print(a++);
					flag=false;
				}
				else if(i<7 && j>=i && j<=12-i && flag==false )
				{
					System.out.print(" ");
					flag=true;
				}
				else if(i>6 && j>=12-i &&j<=i && flag==true)
				{
					
					System.out.print(a++);
					flag=false;
				}
				else if(i>6 && j>=12-i &&j<=i && flag==false)
				{
					System.out.print(" ");
					flag=true;
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
