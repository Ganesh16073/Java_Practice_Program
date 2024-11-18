import java.util.*;
public class ExceptionSwitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice");
		System.out.println("1 : Array index Out of Bounce Exception");
		System.out.println("2 : String Index Out of Bounce Exception");
		System.out.println("3 : Arithematic Exception");
		System.out.println("4 : NullPointer Exception");
		System.out.println("5 : NumberFormat Exception");
		System.out.println("6 : InputMisMatch Exception");
		System.out.println("7 : Class Not found Exception");

		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				int size;
				System.out.println("Enter the Size of Array");
				size=sc.nextInt();
				int a[]=new int[size];
				try
				{
					for(int i=0;i<=a.length;i++)
					{
						a[i]=sc.nextInt();
					}					
				}
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
				break;
				
			case 2:
				String str="ganesh";
				try
				{
					System.out.println(str.charAt(str.length()));
				}	
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}

				break;
					
			case 3:
				try
				{
					System.out.println("Enter the value a and b");
					int p=sc.nextInt();
					int q=sc.nextInt();
					System.out.println((p/q	));
				}
				
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
				// finally
				// {
					// System.out.println("I Am Final");
				// }
				break;
				
			case 4:
				String s=null;
				try
				{
					System.out.println(s.length());
				}	
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
				break;
				
			case 5:
				String num="abc";
				try
				{
					int no=Integer.parseInt(num);
					System.out.println(no);
				}
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
				break;
				
			case 6:
				System.out.println("Enter something");
				try
				{
					int oo=sc.nextInt();
				}	
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
				break;
				
			case 7:
					
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					
				
				}
				catch(Exception ex)
				{
					System.out.println("Error is "+ex);
				}
				break;
			default:
				System.out.println("Invalid choice");

		}
	}
}