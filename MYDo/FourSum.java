import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int arr[]=new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> list=Solution.findSum(arr, 0);
        list.forEach(System.out::println);

        
    }
}
class Solution{
    public static List<List<Integer>> findSum(int nums[], int target)
    {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int k=j+1;
                int l=nums.length-1;

                while(k<l)
                {
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target)
                    {
                        list.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                        while (k<l && nums[k]==nums[k+1]) {
                            k++;
                        }

                        while (k<l && nums[l]==nums[l-1]) {
                            l--;
                        }
                        k++;
                        l--;
                    }
                    else if(sum<0)
                    {
                        k++;
                    }
                    else
                    {
                        l--;
                    }
                }
            }
        }
        return list;
    }
}
