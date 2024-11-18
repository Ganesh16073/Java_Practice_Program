import java.util.*;
public class Permutation
{
	public static void main(String args[])
	{
		int num[]={1,2,3,4};
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=0;
		for(int i=0;i<num.length;i++)
		{
			n=num[i];
			for(int j=0;j<num.length;j++)
			{
				if(i!=j)
				{
					n=n*10+num[j];
				}
				if(j==num.length-1)
				{
					list.add(n);
				}
			}
		}
		Collections.sort(list);
		System.out.println("The Combinations is ==>> "+list);
	}
}