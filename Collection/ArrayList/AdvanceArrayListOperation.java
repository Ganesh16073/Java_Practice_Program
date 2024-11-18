import java.util.*;
public class AdvanceArrayListOperation
{
	public static void main(String args[])
	{
		List<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(10,20,10,22,25,50,30,50,33,23,40,45,48,25,10,5,30,35,39,400));
		Scanner sc=new Scanner(System.in);
		do
		{
			
			System.out.println("Enter the Choice");
			System.out.println("1: Rotating Elements in an ArrayList");
			System.out.println("2: Subarray with Maximum Sum");
			System.out.println("3: Removing Consecutive Duplicates");
			System.out.println("4: Finding All Unique Triplets That Sum to Zero");
			System.out.println("5: Rearranging ArrayList Alternately");
			System.out.println("6: Finding the Longest Increasing Subsequence");
			System.out.println("7: Merging K Sorted ArrayLists");
			System.out.println("8: Finding the First Non-Repeating Element");
			System.out.println("9: Finding Pairs with Given Difference");
			System.out.println("10: Exit");
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Number of times to Rotate an list");
					int n=sc.nextInt();
					int size=list.size();
					n=n%size;
					if(n!=0)
					{
						Collections.reverse(list.subList(0,size-n));
						Collections.reverse(list.subList(size-n,size));
						Collections.reverse(list);
					}
					
					System.out.println("The Rotated List is =>> "+list);
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println();
					break;
				
				case 2:
					System.out.println("Enter the count of subarray to find maximum");
					int sub=sc.nextInt();
					size=list.size();
					int max=0;
					int prevmax=0;
					int start=0;
					int end=0;
					if(sub>size)
					{
						System.out.println("Index out of Bounce");
						break;
					}
					else
					{
						for(int i=0;i<size && i<size-sub+1;i++)
						{
							max=list.get(i);
							for(int j=i+1;j<size && j<i+sub;j++)
							{
								if(max<list.get(j))
								{
									start=i;
									end=j+1;
									max=list.get(j);
								}
							}
						}
						System.out.println("The Maximum subList is => "+list.subList(start,end)+" the Element is "+max);
						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println();
						break;
					}
				
				case 3:
					System.out.println("The Remeoved Dub
					
			
			}
		}while(true);
		
		
	}
}
