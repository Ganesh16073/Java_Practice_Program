import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreeSum {
    public static void main(String args[])
    {
        int arr[]=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list=Solution.findSum(arr, 0);
        list.forEach(System.out::println);
        
    }
}
class Solution{

    public static List<List<Integer>> findSum(int nums[], int target)
    {
        List<List<Integer>> list=new CopyOnWriteArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;

            while (j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum== target)
                {
                    list.add(List.of(nums[i],nums[j],nums[k]));

                    while (j<k && nums[j]==nums[j+1]) {
                        j++;
                    }

                    while (j<k && nums[k]==nums[k-1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
                
            }
        }
        return list;

    }
    
}
