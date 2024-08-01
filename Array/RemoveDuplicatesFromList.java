import java.util.*; // Using ArrayList 
public class RemoveDuplicatesFromList
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int size;
		System.out.println("Enter the Size Of Array");
		size=obj.nextInt();
		for(int i=0;i<size;i++)
		{
			int input=obj.nextInt();
			arr.add(input);
		}
		System.out.println("The Array Element Are");
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("The Duplicate Removed from Arra is");
		int dup=0;
		for(int i=1;i<arr.size();i++)
		{
			if(arr.get(dup)!=arr.get(i))
			{
				dup++;
				arr.set(dup,arr.get(i));
			}
		}
		
		for(int i=0;i<(arr.size())-dup;i++)
		{
			System.out.println(arr.get(i));
		}
		
		
	}
}
		
