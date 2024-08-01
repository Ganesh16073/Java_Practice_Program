import java.util.*;
class RemoveDuplicate
{
	ArrayList<Integer> a=new ArrayList<>();
	void setValue(ArrayList<Integer> arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			a.add(arr.get(i));
		}			
	}
	void removedup()
	{
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)==a.get(j))
				{
					a.remove(j);
				}
			}
		}
		System.out.println("The Duplicate removed Array is");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}
public class RemoveDuplicteApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		RemoveDuplicate obj=new RemoveDuplicate();
		ArrayList<Integer> arr=new ArrayList<>();
		int size;
		System.out.println("Enter the Array Size");
		size=sc.nextInt();
		System.out.println("Enter the Array Element");
		for(int i=0;i<size;i++)
		{
			int input=sc.nextInt();
			arr.add(input);
		}
		obj.setValue(arr,arr.size());
		obj.removedup();
	}		
}