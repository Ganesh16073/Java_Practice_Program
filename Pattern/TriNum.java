public class TriNum
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=0;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					if(j<=5)
					{
						a++;
						System.out.print(a);
						
					}		
					else if(j>5)
					{
						a--;
						System.out.print(a);
					}

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