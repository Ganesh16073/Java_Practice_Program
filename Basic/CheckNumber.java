import java.util.*;
public class CheckNumber
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int no;
String result;
System.out.println("Enter Num to  Check");
no=obj.nextInt();
result=(no<0)?"Number is negative":(no>0)?"Number is Positive":"Number is Zero";
System.out.println(result);
}
}