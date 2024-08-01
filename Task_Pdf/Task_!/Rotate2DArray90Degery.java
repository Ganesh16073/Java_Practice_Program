import java.util.*;
public class Rotate2DArray90Degery
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char[][] a,b;
		int size;
		System.out.println("Enter the Equal Number of Rows and Coloums");
		size=sc.nextInt();
		a=new char[size][size];
		b=new char[size][size];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++) // input
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.next().charAt(0);
			}
		}
		for(int i=0;i<a.length;i++) //logic
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][2-i]=a[i][j];
			}
		}
		
		for(int i=0;i<a.length;i++) //print
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}
}
