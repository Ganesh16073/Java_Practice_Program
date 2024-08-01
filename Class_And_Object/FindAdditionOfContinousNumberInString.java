import java.util.*;
public class FindAdditionOfContinousNumberInString
{
	public static void main (String args[])
	{
		int temp=0,sum=0;
		Scanner sc=new Scanner(System.in);
		String st="Abc 123 ghi 456 klm 789";
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==32)
			{
				sum=sum+temp;
				temp=0;
			}
			else if(ch[i]>=48 && ch[i]<=57)
			{
				temp=temp*10+ch[i];
			}
			
		}
		System.out.println(sum);

	}
}