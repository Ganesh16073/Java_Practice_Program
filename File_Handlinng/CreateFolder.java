import java.io.*;
public class CreateFolder
{
	public static void main(String args[])
	{
		File f=new File("D:\\Pratical Task\\FileHandlingTry");
		boolean check=f.exists(); // check folder is present or not
		if(check)
		{
			System.out.println("Folder Already Present");
		}
		else
		{
			boolean result=f.mkdir(); // create Folder
			if(result)
			{
				System.out.println("Folder Creater SucessFull...........");
			}
			else
			{
				System.out.println("Some Problem is There........................");
			}
		}
	}
}