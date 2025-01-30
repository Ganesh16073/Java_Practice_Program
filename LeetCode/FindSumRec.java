import java.util.ArrayList;
import java.util.List;

public class FindSumRec {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,6,7};
        List<List<Integer>> result=new ArrayList<>();
        Solution.findCombination(arr, 12, 0, result, new ArrayList<>());
        result.forEach(System.out::println);
    }
    
}
class Solution
{
    public static void findCombination(int []arr,int target ,int start, List<List<Integer>> result, List<Integer> current)
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
                findCombination(arr, target-arr[i], i, result, current);
                current.remove(current.size()-1);
            }
        }
    }
}
