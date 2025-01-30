import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[]=new int[]{10,1,2,7,6,5};
        List<List<Integer>> list=new CopyOnWriteArrayList<>();
        Solution.FindCombination(arr, 8, 0,new CopyOnWriteArrayList<>(), list);
        list.forEach(System.out::println);
    }
}
class Solution
{
    public static void FindCombination(int arr[],int target,int start,List<Integer> current,List<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new CopyOnWriteArrayList<>(current));
            return;
        }
        for(int i=start;i<arr.length;i++)
        {
            if(arr[i]<=target)
            {
                current.add(arr[i]);
                FindCombination(arr, target-arr[i], i, current, result);
                current.remove(current.size()-1);
            }
        }
    }
}
