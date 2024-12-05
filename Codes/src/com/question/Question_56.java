package com.question;
import java.util.*;
public class Question_56 {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,0,4,0,2,0,5,0,4,0,7,0,9}; // move all 0 to last;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				arr[arr.length-1]=0;
			}
		}
		System.out.println("The moved 0 to right side array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
