import java.util.Scanner;

public class PrintBackTracking5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        Solution.fun(1, num);
        sc.close();
    }
}
class Solution{
    public static void fun(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        fun(i+1,n);
        System.err.println(i);
    }
}