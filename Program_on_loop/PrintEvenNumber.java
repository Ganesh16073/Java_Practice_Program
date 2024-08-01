import java.util.*;
public class PrintEvenNumber
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int no;
		System.out.println("Enter the Range to print even Number");
		no=obj.nextInt();
		int i=1;
		while(i!=no+1)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}