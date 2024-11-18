public class Pattt
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j<=5 &&i>=j)
				{
					System.out.print(j);
				}
				else if(j > 10 - i)
				{
					System.out.print(10 - j + 1);
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
