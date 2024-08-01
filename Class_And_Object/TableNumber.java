import java.util.*;
class Table{
	private int no;
	void setNum(int x)
	{
		no=x;
	}
	void callTable()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+" * "+i+" = "+no*i);
		}
	}
}
public class TableNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no;
		Table obj=new Table();
		System.out.println("Enter the Number To find Table");
		no=sc.nextInt();
		obj.setNum(no);
		System.out.println("The Table is");
		obj.callTable();
		
	}
}