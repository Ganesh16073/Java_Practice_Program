import java.util.*;
public class PrintNaturalNumber
{
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	int no;
	System.out.println("Enter n number to print natural number");
	no=obj.nextInt();
	for(int i=1;i<=no;i++)
	{
		System.out.println(i);
	}
}
}