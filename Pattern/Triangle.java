public class Triangle
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(j>=i && j<7-i)
				{
					System.out.print("$ ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
