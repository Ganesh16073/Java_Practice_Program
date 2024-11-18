import java.io.*;
public class UsingBufferReader
{
	public static void main(String args[])
	{
		System.out.println("Using read()..................");
		System.out.println();
		System.out.println("Enter the input");
		
		try
		{
			int a=System.in.read();
			System.out.println(a);  // it return asci code
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		System.out.println("Using BufferedReader.....................");
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bu=new BufferedReader(in);
		
		try
		{
			System.out.println("Enter the Number..");
			bu.readLine();
			String str=bu.readLine(); // it default return String
			System.out.println(str);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			bu.close();
		}
		
		
		
	}
}