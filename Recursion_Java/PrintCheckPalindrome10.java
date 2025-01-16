import java.util.Scanner;

public class PrintCheckPalindrome10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to check the palindrome");
        String str=sc.nextLine();
        if(Solution.fun(str,0,str.length()-1))
        {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is Not a palindrome");
        }
        sc.close();

    }
}
class Solution
{
    public static boolean fun(String str,int start,int end)
    {
        if(start>=end){ // if all character are Equal then true
            return true;
        }

        if(str.charAt(start)!=str.charAt(end)) // if some character are not equal ther return false
        {
            return false;
        }
        return fun(str,start+1,end-1);
    }

}