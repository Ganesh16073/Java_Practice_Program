import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]=new int[]{1,3,3,4,6,2,1,70};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to Search");
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int res=Solution.binarySearch(arr, num);
        sc.close();
        if(res!=-1)
        {
            System.out.println("The element is found in index :: "+res);
        }
        else
        {
            System.out.println("the Element is not found ");
        }
        

    }
}

class Solution
{
    public static int binarySearch(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            if (arr[mid] < key)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
            
        }
        return -1;
    }

}