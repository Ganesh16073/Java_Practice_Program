public class StringBufferApp
{
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("Ganesh"); // StringBuffer is Threed Safe
		System.out.println(s);
		
		s.append(" Kulkarni"); // like concate
		System.out.println(s);
		
		System.out.println("Space capacity 16 byte will be extra to have continous memory =>>  "+s.capacity());
		
		s.insert(7,"H "); // used to insert at specify index
		System.out.println(s);
		
		
		s.replace(1,3,"change"); // replace start, end-1, value
		System.out.println(s);
		
		
		s.delete(1,6); // delete start,end-1
		System.out.println(s);
		
		s.deleteCharAt(0); // delete at specific character
		System.out.println(s);
		
		s.replace(0,s.length(),"Ganesh");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		s.setLength(50);
		System.out.println("The length can be incresed by setLength() Method =>>  "+s.capacity());
		System.out.println(s);
		
		s.ensureCapacity(100);// minimum Capacity can be set by this method n*n+2;
		System.out.println(s);
		
	
		
	}
}
