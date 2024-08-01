import java.util.*;
public class FindSumFromString
{
	public static void main(String args[])
	{
		int temp=0,sum=0;
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=sc.nextLine();  // "Hello 123 world 456 java 987 program" ; O/P =>123+456+987== 1566
		char[] ch=new char[str.length()];
		ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) // logic
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				temp=temp*10+(ch[i]-'0');
			}
			else
			{
				sum=sum+temp;
				temp=0;
			}
		}
		sum += temp; // last temp value to add
		System.out.println(sum+" Is the sum of continous number in string");
		
	}
}