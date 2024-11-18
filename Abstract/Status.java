
public class Status
{
	public static void main(String args[])
	{
		int i=5;
		Track t=Track.RUNNING;
		System.out.println(t.ordinal()); // print index
		
		Track[] ss=Track.values(); // convert all values to string
		
		for(Track val:ss)
		{
			System.out.println(val);
		}
		
		Switch(t) // also used as Track
		{
			case RUNNING:
				System.out.println("Printing from RUNNING");
				break;
			case FAILED:
				System.out.println("Printing FAILED");
				break;
			case PENDING:
				System.out.println("Printing from PENDINNG");
				break;
			case SUCCESS:
				System.out.println("Printing from SUCCESS");
				break;
		}
	}
}
enum Track // we cannot extends or implament enum 
 // in extend java.labg.enum by default , we can check by getSuperClass()
{ 
	RUNNING, FAILED,PENDING,SUCCESS;
	
}