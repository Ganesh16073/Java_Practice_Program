import java.util.Scanner;

public class PrintBackTrackingMul8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int rus=Solution.fun(num);
        System.out.println(rus);
        sc.close();
    }
}
class Solution
{
    public static int fun(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fun(n-1);
    }

}
