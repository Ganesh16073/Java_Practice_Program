import java.util.*;
public class RightTrianglePyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i>=j && i<=5) || (j<=10-i && i>5))
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
// **
// ***
// ****
// *****
// ****
// ***
// **
// *