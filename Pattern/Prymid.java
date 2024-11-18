public class Prymid
{
	public static void main(String arg[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=i;
			for(int j=1;j<=10;j++)
			{
				if(j<=5 && i>=j)
				{
					System.out.print(j);
				}
				else if(j>5 && j>=11-i)
				{
					System.out.print(a);
					a--;
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
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321