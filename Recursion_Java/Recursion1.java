
public class Recursion1
{
    public static void main(String args[])
    {
        System.out.println("Hello");
        Solution.recFunction(20);

    }
}
class Solution
{
    public static int count=0;
    public static void recFunction(int n)
    {
        if(count>=n)
        {
            return;
        }
        System.out.println(count*n);
        count++;
        recFunction(n);
    }

}