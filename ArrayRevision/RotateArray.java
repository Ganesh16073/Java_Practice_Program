import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the Number to rotate an array");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Before the Rotations");
        for(int a:arr)
        {
            System.out.println(a);
        }
        int n=num%arr.length;
        n=n-1;
        for(int i=0,j=n;i<n/2;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=n+1,j=arr.length-1;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println("After the Reverse");
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
    
}
