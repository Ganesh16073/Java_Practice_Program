import java.io.*;
public class GetAllFloder
{
	public static void main(String args[])
	{
		File  f=new File("C:\\Program Files\\Java\\jdk-21\\bin");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isDirectory())
			{
				System.out.println(list[i]);
			}
			
		}
		
		
	}
}
          // ListFiles ==>> Folders, Files