import java.util.Scanner;

public class PrintName2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Solution.fun(1, num);
        sc.close();
    }
    
}
class Solution
{
    public static void fun(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("GAnesh "+i);
        fun(i+1,n);
    }
}
