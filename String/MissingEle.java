package com.string;

public class MissingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0;
		int a[]=new int[] {1,5,7,9,13};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				sum=sum+j;
				count++;
			}
		}
		System.out.println((double)(sum/count));
	}

}
