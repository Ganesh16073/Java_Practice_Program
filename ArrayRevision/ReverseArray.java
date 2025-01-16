public class ReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("Before the Array Revers ");
        for(int a:arr)
        {
            System.out.println(a);
        }
        for(int i=0;i<arr.length/2;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println("After the Array Revers ");
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
    
}
