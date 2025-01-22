package com.test;

import java.util.Scanner;

public class SecondMax {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array size");
//		int size=sc.nextInt();
//		int []arr=new int[size];
//		System.out.println("Enter the array Element");
//		for(int i=0;i<size;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		
		int []arr=new int[] {1,4,5,2,5,8,9,111,8,9,9,111};
		
		int prev=arr[0];
		int secMax=-1;
		if(arr.length==0 || arr==null)
		{
			System.out.println("Array is Empty");
		}
		else
		{
			for(int i=1;i<arr.length;i++)
			{
				if(secMax==-1)
				{
					secMax=prev;
				}
				if(arr[i]>prev)
				{
					
					secMax=prev;
					prev=arr[i];
					
				}
			}
			System.out.println("The second max is :: "+secMax);
		}
		
	}

}
