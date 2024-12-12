package com.que4;

import java.util.Scanner;

public class Except {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		boolean validArr=false;
		
		System.out.println("======================Enter the Array Emlents=======================");
		while(!validArr)
		{
			try
			{
				System.out.println("Enter the array Element");
				for(int i=0;i<arr.length;i++)
				{
					String st=sc.next();
					arr[i]=Integer.parseInt(st);
				}
				validArr=true;
				
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Manage the size of array");
				e.printStackTrace();
			}catch (NumberFormatException e) {
				System.out.println("Enter the INTEGER type data");
				e.printStackTrace();
			}
		}
		
		
		System.out.println("=================== Access Index +============================");
		boolean validIndex=false;
		while(!validIndex)
		{
			try {
				System.out.println("Enter the index to find value");
				String ind=sc.next();
				System.out.println(arr[Integer.parseInt(ind)]);
				validIndex=true;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Enter the index correct and the max sizeis"+arr.length);
				e.printStackTrace();
			}catch (NumberFormatException e) {
				System.out.println("Enter the INTEGER type data");
				e.printStackTrace();
			}
		}
		
		
		
	}

}
