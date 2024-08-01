import java.util.*;
public class ReversNumApp
{
  public static void main(String args[])
    {
		Scanner obj=new Scanner(System.in);
		int no,rev=0,rem;
		System.out.println("Enter Number to revers");
		no=obj.nextInt();
		for(int i=1;i<=no;i++)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("The Revers of Number is "+rev);
	}
}
 

