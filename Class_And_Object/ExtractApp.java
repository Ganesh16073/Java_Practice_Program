import java.util.*;
class Extract{
	char s[];

		void setValues(char y[])
		{
		s=y;
		}
		void showExtract()
		{
		int sum=0;
			for(int i=0;i<s.length;i++)
			{
				if(s[i]>=48 && s[i]<=57)
				{
				sum=sum+s[i]-48;// 48=0,49=1,50=2; in java system takes ascii values so we need to minus base value frm it that why we initialized -48
				}
			}
			
			System.out.println("Addition of numbers present in string is:- "+sum);
		}
}
public class ExtractApp{
	public static void main(String x[]){
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter String");
		String a=sc.nextLine();// getting string input
		
		char s[]=a.toCharArray();// this is used to convert string into char array
		
		Extract ex = new Extract();
		ex.setValues(s);
		ex.showExtract();
	}
}