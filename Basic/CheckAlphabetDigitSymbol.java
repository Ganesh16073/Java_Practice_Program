import java.util.*;
public class CheckAlphabetDigitSymbol
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	char c;
	String result;
	System.out.println("Enter to check Alphabet or Digit or Special Symbol");
	c=obj.next().charAt(0);
	result=(c>=65 && c<=90 || c>=97 && c<=122)?"It is Alphabet":(c>=48 &&c<=57)?"It is Digit":"It is Special Digit";
	System.out.println(result);
	
 }
}