import java.util.*;
public class PrintBackTracking4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        Solution.fun(num,num);
        sc.close();
        
    }
}

class Solution
{
    public static void fun(int i,int n)
    {
        if(i<1)
        {
            return;
        }
        fun(i-1,n);
        System.err.println(i);
    }
}