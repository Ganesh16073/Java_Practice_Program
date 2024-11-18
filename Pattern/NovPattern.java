import java.util.*;
public class NovPattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int a=2;
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<12;j++)
			{
				if(j%2==1 && flag==0 )
				{
					System.out.print(a++);
					flag=1;
				}
				else if(j%2==0 && flag==1)
				{
					System.out.print(a++);
					flag=0;
				}
				
			}
			System.out.println();
			
		}
	}
}