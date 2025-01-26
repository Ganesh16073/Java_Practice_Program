import java.util.ArrayList;
import java.util.List;

public class Find {

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};

        System.out.println("Target= 7");
        List<List<Integer>> result = Solution.findCombinations(nums, 7, new ArrayList<>(), new ArrayList<>(), 0);
        System.out.println(result); 
    }
}

class Solution {

    public static List<List<Integer>> findCombinations(int[] nums, int target, List<Integer> list, List<List<Integer>> result, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return result;
        }
        if (target < 0) {
            return result; 
        }

        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            findCombinations(nums, target - nums[i], list, result, i);
            list.remove(list.size() - 1); 
        }

        return result;
    }
}
