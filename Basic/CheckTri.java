import java.util.*;
public class CheckTri
{
	public static void main(String args[])
	{		
		Scanner obj=new Scanner(System.in);
		int s1,s2,s3;
		String result;
		System.out.println("Enter The Side 1");
		s1=obj.nextInt();
		System.out.println("Enter THe Side 2");
		s2=obj.nextInt();
		System.out.println("Enter THe Side 3");
		s3=obj.nextInt();
		result=(s1==s2 && s2==s3 && s3==s1)?"It is Equalatrial triangle":"Not Equalatral Triangle";
		System.out.println(result);
		result=(s1==s2 || s2==s3 || s3==s1)?"It is isoscale triangle":"Not isoscale Triangle";
		System.out.println(result);
		result=(s1!=s2 && s2!=s3 && s3!=s1 && s1+s2+s3==180)?"It is scalen triangle":"Not scalen Triangle";
		System.out.println(result);
	}
}
