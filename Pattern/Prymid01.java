public class Prymid01
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=0;
			for(int j=1;j<=10;j++)
			{
				if(j<=5 && i>=j)
				{
					System.out.print((j+1)%2);
				}
				else if(j>5 && j>10-i)
				{
					System.out.print(a);
					if(a==0)
					{
						a=1;
					}
					else{
					a=0;
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