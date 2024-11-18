public class Pattrn
{
	public static void main(String arg[])
	{
		for(int i=1;i<=8;i++)
		{	int a=i;
			int flag=0;
			for(int j=1;j<=8;j++)
			{
				int inc=j;
				if(i<=8 && i>=)
				{
					if(flag==0)
					{
						System.out.print(a);
					}
					else
					{
						System.out.print("*");
					}
					if(flag==0)
					{
						flag=1;
					}
					else{
						flag=0;
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