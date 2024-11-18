package com.org.stringoperation;

public class WordRevers extends StringOperation{
	public void performOperation(String str)
	{
//		char[] ch=str.toCharArray(); logic not work
//		for(int i=0,j=(ch.length-1);i<ch.length/2;i++,j--)
//		{
//			char temp=ch[i];
//			ch[i]=ch[j];
//			ch[j]=temp;
//		}
//		System.out.println("The Revers String is "+ch);
//		
String rev = new StringBuilder(str).reverse().toString();
		
		System.out.println(rev);

	}

}
