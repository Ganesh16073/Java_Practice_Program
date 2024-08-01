import java.util.*;
public class CheckAlphabet
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter to check Voule or Constant");
	char c=obj.next().charAt(0);
	String st=(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u'||c=='A' ||c=='E'|| c=='I'||c=='O'||c=='U')?"It is a Voule":"It is a Constant";
	System.out.println(st);
	
 }
}