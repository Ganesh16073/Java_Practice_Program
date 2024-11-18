import java.util.*;
public class PrintAllPrimeSmallerThanOrEqualToNSieveOfEratosthenesAlgorithm
{
	public static boolean[] sieveOfEratosthenes(int n)
	{
		boolean[] b=new boolean[n+1]; // increase 1 because during loop out of bounce
		Arrays.fill(b,true); // assume all ar prime number
		
		for(int i=2;i*i<=n;i++) // start with 2 becase 0,1 are prime num
		{
			if(b[i]==true) 
			{
				for(int j=i*i;j<=n;j=j+i) // j=4 , j<n , j++ =6
				{
					b[j]=false; // 4,6,8 .. will false
				}
			}
		}
		
		return b;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean prime[];
		int size;
		System.out.println("Enter the Range to Find prime NUmber");
		size=sc.nextInt();
		prime=sieveOfEratosthenes(size);
		System .out.println("Prime numbers smaller than or equal to range is ");
		for(int i=0;i<prime.length;i++)
		{
			if(prime[i]==true)
			{
				System.out.print(i+" ");
			}
		}
	}
}