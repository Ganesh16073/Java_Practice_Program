import java.util.*;
public class FullPyramid
{
	public static void main(String args[])
	{
		int flag=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5*2)-1;j++)
			{
				if(j>=6-i && j<=4+i && flag==1)
				{
					System.out.print("*");
					flag=0;
				}
				else
				{
					System.out.print(" ");
					flag=1;
				}
			}
			System.out.println("");
		}	
		
		System.out.println("=====================================================");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5*2)-1;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}	
	}
}

    // *
   // * *
  // * * *
 // * * * *
// * * * * *
// =====================================================
    // *
   // ***
  // *****
 // *******
// *********