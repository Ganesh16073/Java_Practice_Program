import java.util.*;
public class Pattern1
{
	public static void main (String args[])
	{
		for(int i=1;i<=13;i++)
		{
			for(int j=1;j<=13;j++)
			{
				if(i<=7 && j>=8-i && j<=6+i)
				{
					System.out.print("+");
				}
				else if(i>7 && j>=i-6 && j<=20-i)
				{
					System.out.print("+");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

      // +
     // +++
    // +++++
   // +++++++
  // +++++++++
 // +++++++++++
// +++++++++++++
 // +++++++++++
  // +++++++++
   // +++++++
    // +++++
     // +++
      // +