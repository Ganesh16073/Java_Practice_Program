import java.util.*;
public class ArrayListOperation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();
		do
		{
			System.out.println("Enter the Choice");
			System.out.println("1: Add integers to the list.");
			System.out.println("2: Print the ArrayList");
			System.out.println("3: Update one of the values.");
			System.out.println("4: Remove an element by its index.");
			System.out.println("5: Display the size of the ArrayList.");
			System.out.println("6: Finding Maximum.");
			System.out.println("7: Finding  Minimum.");
			System.out.println("8: Sorting an ArrayList");
			System.out.println("9: Merging Two ArrayLists.");
			System.out.println("10: Removing Duplicates from ArrayList.");
			System.out.println("11: Common Elements Between Two ArrayLists");
			System.out.println("12: Convert ArrayList to Array and Vice Versa");
			System.out.println("13: Check if an ArrayList is Empty");
			System.out.println("14: Reverse an ArrayList");
			System.out.println("15: Frequency of Elements in ArrayList");
			System.out.println("16: Exit");
			
			
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter The Number");
					a.add(sc.nextInt());
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 2:
					System.out.println("The List Element are =>> ");
					Iterator i=a.iterator();
					while(i.hasNext())
					{
						Object obj=i.next();
						System.out.println(obj);
					}
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 3:
					System.out.println("Enter the Number to Update ");
					int up=sc.nextInt();
					int val=a.indexOf(up);
					if(val==-1)
					{
						System.out.println("Number Does Not Exist in List");
						System.out.println();
						System.out.println("-------------------------------------------------");
						System.out.println();
						break;
					}
					else
					{
						System.out.println("Enter the Value to update");
						int uval=sc.nextInt();
						a.set(val,uval);
						System.out.println("The Value Updated");
						System.out.println();
						System.out.println("-------------------------------------------------");
						System.out.println();
						break;
					}
					
				case 4:
					System.out.println("Enter the Index to Delete Value ");
					Integer ind=sc.nextInt();
					boolean bc=a.remove(ind);
					if(bc)
					{
						System.out.println("The Value Removed ");
						System.out.println();
						System.out.println("-------------------------------------------------");
						System.out.println();
						break;
					}
					else
					{
						System.out.println("The Value Not Removed or Invalid Index");
						System.out.println();
						System.out.println("-------------------------------------------------");
						System.out.println();
						break;
					}
					
				case 5:
					System.out.println("The Size of Array is =>> "+a.size());
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 6:
					System.out.println("The Maxmimum element is =>> "+Collections.max(a));
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 7:
					System.out.println("The Minmum Element is =>> "+Collections.min(a));
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 8:
					Collections.sort(a);
					System.out.println("The Sorted List is "+a);
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
				
				case 9:
					ArrayList<Integer> b=new ArrayList<>();
					b.add(11);
					b.add(22);
					b.add(33);
					b.add(44);
					b.add(55);
					b.add(66);
					b.add(77);
					ArrayList<Integer> c=new ArrayList<>();
					c.addAll(a);
					c.addAll(b);
					c.addAll(10,20);
					c.addAll(Arrays.asList(10,20,330));
					System.out.println("The Merged Array is =>"+c);
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 10:
					int dup=0;
					for(int j=0;j<a.size();j++)
					{
						Integer du=a.get(dup);
						Integer au=a.get(j);
						if(du!=au)
						{
							dup++;
							a.set(dup,au);
						}
					}
					int count=0;
					i=a.iterator();
					System.out.println("The Duplicate reoved Element are");
					while(i.hasNext())
					{
						if(count==(a.size()-dup))
						{
							break;
						}
						count++;
						Object obj=i.next();
						System.out.println(obj);
					}
					break;
					
					
				case 11:
					ArrayList<Integer> common=new ArrayList<>(a);
					ArrayList<Integer> co=new ArrayList<>(Arrays.asList(10,20,1,2,22,33,44,55));
					
					common.retainAll(co);
					System.out.println("The Common Element are =>> "+common);
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 12:
					String[] arr=new String[a.size()];
					arr=a.toArray(arr);
					for(String s:arr)
					{
						System.out.println(s);
					}
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println();
					break;
					
				case 13:
					boolean ck= a.isEmpty();
					if(ck)
					{
						System.out.println("The Lis Is Empty");
						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println();
						break;
					}
					else
					{
						System.out.println("The Lis Is Not Empty");
						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println();
						break;
					}
					
				case 14:
					System.out.println("Before List => "+a);
					Collections.reverse(a);
					System.out.println("After Reverse => "+a);
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println();
					break;
					
				case 15:
				
				
				case 16:
					System.out.println();
					System.out.println("---------------------    Exited    --------------------");
					System.out.println();
					System.exit(0);
				
					
					
					
			}
		}while(true);
		
	}
}