import java.util.*;
public class RightNumberInvertedPattern
{
	public static void main(String args[])
	{
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j<5-i)
				{
					System.out.print(5-j);
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println("");
		}	
	}
}
// 54321
// 5432
// 543
// 54
// 5