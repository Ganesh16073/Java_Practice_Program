public class Twosum {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,4,32,1,34,24,5,67,87,57,92};

    }
}
class Solution
{
    public static int[] twoSum(int []a, int target)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}