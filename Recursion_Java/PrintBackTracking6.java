import java.util.Scanner;

public class PrintBackTracking6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nummber to add");
        int num=sc.nextInt();
        Solution.fun(num,0);
        sc.close();
    }
}
class Solution
{
    public static void fun(int i,int sum) // understanding the paramertized// if i=3,sum=0
    {
        if(i<1)
        {
            
            return;
        }
        fun(i-1,sum+i); // 0,3,5 o/p 
        System.err.println(sum);
    }
}
