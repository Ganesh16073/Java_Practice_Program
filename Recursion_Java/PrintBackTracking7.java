import java.util.Scanner;

public class PrintBackTracking7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println(Solution.fun(n));
        sc.close();
    }
}
class Solution
{
    public static int fun(int n) // functional Recursion
    {
        if(n<1)
        {
            return 0;
        }
        return n+fun(n-1);// 3+2+1 recursion
    }
}
