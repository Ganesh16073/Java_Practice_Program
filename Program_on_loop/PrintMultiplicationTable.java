import java.util.*;
public class PrintMultiplicationTable
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int no,i=1;
		System.out.println("Enter No to print its Table");
		no=obj.nextInt();	
		while(i!=11)
		{
			System.out.println(no*i);
			i++;
		}
	}
}