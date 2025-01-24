public class Fabnoic {
    public static void main(String[] args) {
        Solution.fun(5, 1, 1);
    }
    
}
class Solution
{
    public static int count=1;
    public static void fun(int n, int start, int second)
    {
        if(n<=0)
        {
            return ;
        }
        if(!(count==1))
        {
            System.out.print(start+second);
            for(int i=0;i<start+second;i++)
            {
                System.out.print("*");
            }
            count++;
            fun(n, second, start+second);

        }
        else
        {
            System.out.println(start+"*");
            System.out.println(start+"*");
            count++;
            fun(n, start, second);
        }

    }
}