import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        int []a=new int[]{1,4,6,7,9,3,4,5,55,66,77,2,33,23,13,33};
        Solution.fun(a, 13, list);
        list.forEach(System.out::println);
    }
}
class Solution
{
    public static void fun(int []nums,int target, List<List<Integer>> list)
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i+1])
            {
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while (j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1])
                    {
                        j++;
                    }
                    while (j<k && nums[k]==nums[k-1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
    }
}