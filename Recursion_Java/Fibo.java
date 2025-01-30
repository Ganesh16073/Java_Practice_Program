public class Fibo {
    public static void main(String[] args) {
        int n=Solution.fib(3);
        System.out.println(n+" is the number");
    }
}
class Solution
{
    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int last=fib(n-1);
        int second=fib(n-2);
        return last+second;

    }
}