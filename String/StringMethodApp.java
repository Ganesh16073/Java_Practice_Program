import java.util.*;
public class StringMethodApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=new String("OperationOnString");
		System.out.println("String a==> "+a);
		// .length()
		System.out.println("To find String Length using .length() ==> "+a.length()+"\n");
		
		// CharAt()
		System.out.println("to find Character at Specific index using CharAt(int index 4) ==> "+a.charAt(4)+"\n");
		
		// concate()
		String b="Methods";
		System.out.println("String b==> "+b);
		String c=a.concat(b);
		System.out.println("Concat twoString using concat()>> c=a.concat(b) "+c);
		
		// toUpperCase()
		
		String d=b.toUpperCase();
		System.out.println("Using toUpperCase() d=b.toUpperCase(); ==> " +d);
		
		// toLowerCase()
		String e=d.toLowerCase();
		System.out.println("Using toLowerCase() e=d.toLowerCase(); ==> " +e);
		
		// subString(int stare, int end);
		String subst=d.substring(2,5);
		System.out.println("Using subString(int stare, int end) g=c.subString(4,10) ==> " +subst);
		
		// Split(string str)
		
		String sp=new String("abc mno hik");
		String spl[]=sp.split(" ");
		for(String con:spl)
		{
			System.out.println(con);
		}
		
		//indexOf(String)
		int sof=sp.indexOf("mno");
		System.out.println("Using indexOf"+sof);
		
		//trim
		String use=new String("         	Ga  ne  sh  "); //  
		String tr=use.trim();
		System.out.println("Using trim remove first space"+tr);
		
		//int compareTo(String) //return asci code
		int comp=tr.compareTo(sp);
		System.out.println("Using compareTo() it return first mismatch ascicode"+comp);
		
		// boolean endsWith(String): return true if condition statify or false
		boolean be=sp.endsWith("ik");
		System.out.println("using endsWith() to check condition return true or false   ==>> "+be);
		
		// boolean startsWith(String)  return true if condition statify or false
		boolean start=sp.startsWith("ab");
		System.out.println("Using startsWith() to check condition ==>> "+start);
		
	}

}