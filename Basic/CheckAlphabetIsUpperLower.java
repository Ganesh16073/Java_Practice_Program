import java.util.*;
public class CheckAlphabetIsUpperLower
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	char c;
	String result;
	System.out.println("Enter to check Alphabet Is Upper or Lower");
	c=obj.next().charAt(0);
	result=(c>=65 && c<=90)?"Alphabet is Upper case":"Alphabet is Lower case";
	System.out.println(result);
	
 }
}