import java.io.*;
public class OnlyTryBlock
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Using only try block");
		
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the String");
			String str=bu.readLine();
			System.out.println(str);
			
	
	}
}