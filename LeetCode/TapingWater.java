public class TapingWater {
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int sum=Solution.fun(arr);
        System.out.println(sum);
        
    }
    
}
class Solution
{
    public static int fun(int []hight)
    {
        int i=0;
        int j=hight.length-1;
        int left_max=hight[0];
        int right_max=hight[j];
        int sum=0;
        while (i<j) {
            if(left_max<=right_max)
            {
                sum+=(left_max-hight[i]);
                i++;
                left_max=Math.max(left_max, hight[i]);
            }
            else
            {
                sum+=(right_max-hight[j]);
                j--;
                right_max=Math.max(right_max, hight[j]);
            }
            
        }


        return sum;
    }
}
