import java.util.*;
public class EncryptDataToBinary
{
	public static void main(string args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch[];
		int size;
		Sysrem.out.println("Enter the Size of Array");
		size=sc.nextInt();
		ch=new char[size];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		BinaryCode obj=new BinaryCode();
		obj.setChar(ch);
	}
}
class BinaryCode
{
	char c[];
	void setChar(char ch[])
	{
		c=ch;
	}
	int BinaryConvert()
	{
		
	}
}