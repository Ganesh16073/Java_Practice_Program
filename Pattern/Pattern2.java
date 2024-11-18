public class Pattern2
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j>=i && j<=i+3)
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
				System.out.println();
			}
		}
	}
}