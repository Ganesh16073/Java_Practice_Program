import java.util.ArrayList;
import java.util.List;

public class PrintSubSequence {
    public static void main(String[] args) {
        int arr[]=new int[]{3,1,2};
        List<List<Integer>> list=new ArrayList<>();
        Solution.fun(0, arr.length, arr, new ArrayList<>(), list);
        list.forEach(System.out::println);
    }
}
class Solution{
    public static void fun(int ind,int n,int arr[],List<Integer> current,List<List<Integer>> result)
    {
        if(ind==n)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[ind]);
        fun(ind+1,n,arr, current, result);
        current.remove(current.size()-1);
        fun(ind+1,n,arr,current,result);
    }
}