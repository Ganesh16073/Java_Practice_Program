import java.io.*;
public class DriverInfo
{
	public static void main(String args[])
	{
		File f[]=File.listRoots(); //get Driver
		for(int i=0;i<f.length;i++)
		{
			long totalSpace=f[i].getTotalSpace(); // return Total Space
			System.out.println(f[i]+" the totalSpace is "+(totalSpace/1073741824)+" GB");
			
			long freeSpace=f[i].getFreeSpace(); // returnn FreeSpace
			System.out.println(f[i]+" The total free Space is "+(freeSpace/1073741824)+" GB");
			
		}
	}
}