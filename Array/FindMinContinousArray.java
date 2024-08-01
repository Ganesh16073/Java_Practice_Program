import java.util.*;
class Solution
{
	public static void FindMin(ArrayList<Integer> arr,int sub)
	{
		for(int i=0;i<arr.size();i++)
		{
			int min=arr.get(i);
			int temp=i;
			while(temp<sub && sub<=arr.size())
			{
				if(arr.get(temp)<min)
				{
					min=arr.get(temp);
				}
				System.out.print(arr.get(temp)+" ");
				temp++;
			}
			if(sub<=arr.size())
			{
			System.out.println("= "+min);
			sub++;
			}
		}
		return;
	}
}	
public class FindMinContinousArray
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int size;
		System.out.println("Enter the size of array");
		size=obj.nextInt();
		System.out.println("Enter the array Element");
		for(int i=0;i<size;i++)
		{
			int input;
			input=obj.nextInt();
			arr.add(input);
		}
		int sub;
		System.out.println("Enter the Sub Continus");
		sub=obj.nextInt();
		if(sub>size)
		{
			System.out.println("It is not posible to find Minmum of sub continus array because sub is greater than size");
		}
		else
		{
		Solution.FindMin(arr,sub);
		}
	}
}
		
		
				
		
