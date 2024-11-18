public class CheckedExceptionApp
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (Exception ex)
		{
			System.out.println("The Exception Error is "+ex);
			System.out.println("Class Not found");
		}
	}
}