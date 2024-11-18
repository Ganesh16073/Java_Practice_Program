import java.util.*;
public class FindCombination
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num[]={1,2,3,4,5,6,7,8};
		int n=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			n=0;
			for(int j=i;j<num.length;j++)
			{
				n=n*10+num[j];
				if(n%2==0)
				{
					list.add(n);
				}
			}
		}
		Collections.sort(list);
		System.out.println("The Combination of Even Number is ==> "+list);
		
		
	}
}