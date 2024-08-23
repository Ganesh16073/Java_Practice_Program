import java.util.*;
class ConvertToUpperOnEvenPosition
{
	char ch[];
	ConvertToUpperOnEvenPosition(char[] ch)
	{
		this.ch=ch;
	}
	
	void convert()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				if(ch[i]>=97)
				{
					ch[i]=Character.toUpperCase(ch[i]);
					// ch[i]=(char) ( (int)(ch[i]-32) ) using type casting
				}
			}
		}
	}	
	public char [] getConvertedArray()
	{
		return ch;		
	}			
}
public class ConvertToUpperOnEvenPositionApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char[] ch;
		String str;
		System.out.println("Enter the String to convert to upperCase on even Position");
		str=sc.nextLine();
		ch=str.toCharArray();
		ConvertToUpperOnEvenPosition c1=new ConvertToUpperOnEvenPosition(ch);
		c1.convert();
		ch=c1.getConvertedArray();
		System.out.println("The  convert to upperCase on even Position is");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
		
	}
}