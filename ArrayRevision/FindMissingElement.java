import java.util.*;
public class FindMissingElement {
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,16};
        int misSum=Solution.findSumOfMissingElement(arr);
        System.out.println("the Sum of missing number is :: "+misSum);
        System.out.println();
        int misCount=Solution.findCountOfMissingElement(arr);
        System.out.println("The Count of Missing Element is "+misCount);

    }
    
}
class Solution
{
    public static int findCountOfMissingElement(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=arr[i]+1;j<arr[i+1];j++)
            {
                count++;
            }
        }
        return count; 
    }
    public static int findSumOfMissingElement(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=arr[i]+1;j<arr[i+1];j++)
            {
                sum+=j;
            }
        }
        return sum;
    }
}
