import java.util.Scanner;

public class MultipleRecursionCall11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to find out the fibonechi series");
        int num=sc.nextInt();
        int fact=Solution.fact(num);
        System.out.println("the Fibbonesiris of "+num+" is :: "+fact);
        sc.close();
    }
    
}
class Solution{
    public static int fact(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int prev=fact(n-1);
        int lprev=fact(n-2);
        return prev+lprev;
    }

}