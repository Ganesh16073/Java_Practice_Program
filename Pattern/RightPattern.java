import java.util.*;
public class RightPattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Equalent Number of row and coloum");
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}	
	}
}

// *
// * *
// * * *
// * * * *
// * * * * *