import java.util.*;
public class AdditionOfTwoMatrix
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int row,col;
		System.out.println("Enter The Row And Colum Size Of Array");
		row=obj.nextInt();
		col=obj.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		System.out.println("Enter The Array Element of 1st Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter The Array Element of 2st Matrix");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("The Array Element Are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println();
		}
	}
}
		