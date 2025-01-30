import java.util.*;

public class FindCombination {
    public static void main(String[] args) {
        int []arr=new int[]{2,3,6,7};
        List<List<Integer>> list=new ArrayList<>();
        Solution.findCombination(arr, 7, 0,new ArrayList<>(), list);
        list.forEach(a-> System.out.println(a));
    }
}
class Solution
{
    public static void findCombination(int arr[],int target, int start,List<Integer> current, List<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<arr.length;i++)
        {
            if(arr[i]<=target)
            {
                current.add(arr[i]);
                findCombination(arr, target-arr[i], i, current, result);
                current.remove(current.size()-1);
            }
            
        }
    }
}
