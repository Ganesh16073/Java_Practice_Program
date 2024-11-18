public class RightTri
{
	public static void main(String args[])
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((j<=i && i<5)||(i>=5 && j<9-i))
				{
					System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				
				}
			
			}
		System.out.println();
		}
		
		
		int n = 7; // total number of rows

        // upper part
        for (int i = 1; i <= n; i += 2) {
            for (int j = i; j < n; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = n; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
   
	}
	
	
}
