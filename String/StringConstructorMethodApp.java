import java.util.*;
public class StringConstructorMethodApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// String() used to create String
		String a=new String("String() Constructor");
		System.out.println("using String() "+a);
		
		// pasing character array to  String
		char ch[]=new char[]{'a','b','c','d','e','f'};
		String b= new String(ch);
		System.out.println(a);
		System.out.println("using String(ch[]) ==> "+b);
		
		// pasing Byte array to  String
		byte by[]=new byte[]{65,66,67};
		String c=new String(by);
		System.out.println("using String(byte[]) ==> "+c);
		
		// Using String(char[],int offset,int length) array start, start index, number of charactr
		
		String d=new String(ch,2,3);
		System.out.println("String(char[],int offset,int length) ==> "+d);
		
	}

}