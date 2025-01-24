public class TWater {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int sum=Solution.fun(arr);
        System.out.println(sum);
    }
}
class Solution
{
    public static int fun(int arr[])
    {
        int i=0,j=arr.length-1;
        int left_max=arr[0];
        int right_max=arr[arr.length-1];
        int sum=0;
        while(i<j)
        {
            if(left_max<=right_max)
            {
                sum+=(left_max=arr[i]);
                i++;
                left_max=Math.max(left_max, arr[i]);
            }
            else{
                sum+=right_max-arr[j];
                j--;
                right_max=Math.max(right_max, arr[j]);
            }
        }
        return null;
    }
}