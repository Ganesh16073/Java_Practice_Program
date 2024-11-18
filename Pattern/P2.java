public class P2
{
	public static void main(String args[])
	{
		int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
			if(i==j || j==6-i)
			{
				System.out.printf("#");
			}
			else
			{
				System.out.printf("*");
			}
		}
		System.out.printf("\n");
	}
	}
}
