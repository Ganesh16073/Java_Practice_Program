import java.io.*;
public class GetAllFiles
{
	public static void main(String args[])
	{
		File  f=new File("C:\\Program Files\\Java\\jdk-21\\bin");
		File list[]=f.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
				System.out.println(list[i]);
			}
			
		}
		
		
	}
}