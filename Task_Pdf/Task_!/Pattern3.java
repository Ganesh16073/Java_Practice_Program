import java.util.*;
public class Pattern3
{
	public static void main(String args[])
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<13;j++)
			{
				if(j<6 && j<=i)
				{
					System.out.print(j);
				}
				else if(j>6 && j>=12-i)
				{
					System.out.print(12-j);
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

// 0           0
// 01         10
// 012       210
// 0123     3210
// 01234   43210
// 012345 543210