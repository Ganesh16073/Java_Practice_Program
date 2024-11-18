import java.util.*;
public class ShuffleArray
{
    
    public static void shuffleArray(int[] nums) // Method to shuffle the array
	{
        Random rand = new Random(); 
        
        for (int i = nums.length - 1; i > 0; i--) // Generate a random index from 0 to i
		{
            
            int j = rand.nextInt(i + 1); 
            int temp = nums[i];  // Swap nums[i] with nums[j]
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int[] nums;
		int size;
		System.out.println("Enter the Size Of Array");
		size=sc.nextInt();
		nums=new int[size];
		
		System.out.println("Enter the Array Element");
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
        
        System.out.println("Original Array: ");
        for (int num : nums) 
		{
            System.out.print(num + " ");
        }

        shuffleArray(nums);  // Shuffle the array

        System.out.println("\n\nShuffled Array: ");
        for (int num : nums)
		{
            System.out.print(num + " ");
        }
    }
}