public class CheckAddressOfObject
{
	public static void main(String args[])
	{
		LaptopApp ref=new LaptopApp(); // creating object
		ref.name="HP_15s";
		ref.price=50000;
		
		System.out.println(ref); // trying to print address of object
		// Internel Working is ref.toString()
		
		// System.out.println(System.identityHashCode(ref));
	}
}
class LaptopApp
{
	String name;
	int price;
	
	public String toString()
	{
		System.out.println("Printing using toString Methoe Which is Called internaly");
		return name+" "+price 	;
	}
	
}
