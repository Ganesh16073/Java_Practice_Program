import java.util.*;
public class Pattern1
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  int no;
  System.out.println("Enter Equivalent no of Row and Colounm");
  no=obj.nextInt();
  for(int i=0;i<no;i++)
  {
    for(int j=0;j<no;j++)
	{
	  if(j<=i)
	  {
	    System.out.print("* ");
	  }
	  else
	  {
	    System.out.print(" ");
	  }
	 }
	 System.out.println("\n");
   }
  }
}
   