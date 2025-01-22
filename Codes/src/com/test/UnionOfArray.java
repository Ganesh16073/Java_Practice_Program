package com.test;

public class UnionOfArray implements ArrayInterface{

	int a[];
	int b[];
	int c[];
	@Override
	public void acceptArray(int[] a, int[] b) {
		
		this.a=a;
		this.b=b;
	}

	@Override
	public int[] getResult() {
		c=new int [a.length+b.length];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			c[ind]=a[i];
			ind++;
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(c[i]!=b[j])
				{
					c[ind]=b[i];
					ind++;
				}
			}
			
			
		}
		return c;
	}

}
