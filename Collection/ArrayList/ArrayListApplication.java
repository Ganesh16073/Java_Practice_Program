import java.util.*;
public class ArrayListApplication
{
	public static void main(String args[]) 
	{
		ArrayList al=new ArrayList();
		do
		{
			System.out.println("Enter the Choice");
			System.out.println("1: Add New Element");
			System.out.println("2: View all from ArrayList");
			System.out.println("3: Search Specific Element");
			System.out.println("4: View all element in revers direction");
			System.out.println("5: Find the specific index of Element");
			System.out.println("6: Remove the Specific element in ArrayList");
			System.out.println("7: Count the Size of array");
			System.out.println("8: Exit");
			int choice;
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Element to add");
					Integer i=sc.nextInt();
					al.add(i);
					break;
				
				case 2:
					System.out.println(" The array Element are");
					Iterator it=al.iterator();
					while(it.hasNext())
					{
						Object obj=it.next();
						System.out.println(obj);
					}
					System.out.println();
					break;
				
				case 3:
					System.out.println("Enter The Element to Search");
					int s=sc.nextInt();
					boolean b=al.contains(s);
					if(b)
					{
						System.out.println("The Element is Present in "+(al.indexOf(s)));
						
					}
					else
					{
						System.out.println("Element is not Present");
					}
					System.out.println();
					break;
					
				case 4:
					System.out.println("The Element in reversorder is ");
					ListIterator li=al.listIterator(al.size());
					while(li.hasPrevious())
					{
						Object o=li.previous();
						System.out.println(o);
					}
					System.out.println();
					break;
					
				case 5:
					System.out.println("Enter The Element to Find Index");
					int si=sc.nextInt();
					int val=al.indexOf(si);
					if(val==-1)
					{
						System.out.println("Element is not Present in Array");
					}
					else
					{
						System.out.println("Element is  Present in Array At =>> "+val);
					}
					System.out.println();
					break;
				
				case 6:
					System.out.println("Enter element to Remove the Specific element in ArrayList");
					int se=sc.nextInt();
					b=al.remove(Integer.valueOf(se)); //delete by index or object
					if(b)
					{
						System.out.println("Element Deleted");
					}
					else
					{
						System.out.println("Element Not Present in Array");
					}
					System.out.println();
					break;
				case 7:
					System.out.println("The Size of ArrayList is =>> "+al.size());
					System.out.println();
					break;
				
				case 8:
					System.out.println("------------------- Thank you --------------------");
					System.exit(0);
					break;
				default:
				System.out.println("Invalid Choice");
				
			}
			
			
		}while(true);
	}
}