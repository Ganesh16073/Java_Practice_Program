import java.util.*;
public class StringApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		// Creating or declaring String Method
		String a="String_Using_initlization"; // 1
		String b=new String("String_Using_new_Keyword"); //2
		String c;          // 3
		System.out.println("Enterthe String");
		c=sc.next();
		System.out.println(a+" "+System.identityHashCode(a));
		System.out.println(b+" "+System.identityHashCode(b));
		System.out.println(c+" "+System.identityHashCode(c));
	}

}