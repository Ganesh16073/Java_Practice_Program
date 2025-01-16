public class PrintReversArray9 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("Array before Reversing");
        for (int arr2 : arr) {
            System.out.println(arr2);
        }
        arr=Solution.fun(arr, 0, arr.length-1);
        System.out.println("Array after reversing");
        for (int arr2 : arr) {
            System.out.println(arr2);
        }

    }
}
class Solution
{
    public static int[] fun(int[] arr,int start, int end) // reverse arrray using Recursion
    {
        if(start>=end)
        {
            return arr;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        fun(arr,start+1,end-1);
        return arr;
    }
}
