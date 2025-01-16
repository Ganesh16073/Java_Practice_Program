import java.util.Scanner;

public class FindSubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]=new int[]{1,22,4,45,2,2,5,8,9,55,71,44,3,25,27,18,14,13,39};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target sum to sind the sub array");
        int s=sc.nextInt();
        int sum=0;
        sc.close();
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    sum+=arr[j];
                }
                if(sum==s)
                {
                    int end=j;
                    for(int start=i;start<=end;start++)
                    {
                        System.out.print(start+"+");
                    }
                    System.out.print(" == "+s);
                    System.out.println();
                }

            }
            
        }
    }
    
}
