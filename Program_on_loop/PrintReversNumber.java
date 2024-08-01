import java.util.*;
public class PrintReversNumber
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int no;
		System.out.println("Enter range of number n to revers print");
		no=obj.nextInt();
		while(no!=0)
		{
			System.out.println(no);
			no--;
		}
	}
}