import java.util.*;

class Merge
{
	int a[],b[],c[];
	
	void setValue(int x[],int y[],int z[])//setting values
	{
	a=x;
	b=y;
	c=z;
	}

	void showArray()
	{
		int j,k;
			//first array storing
			for( j=0;j<a.length;j++)
			{
				c[j]=a[j];
			}
			//second array storing
			for( k=0;k<b.length;k++)
			{
				c[j+k]=b[k];
			
			}
		
			for(j=0;j<c.length;j++)
			{
				
			System.out.printf("%d ",c[j]);
			
			}
	}
}
public class MergeApp{

	public static void main(String x[]){
	int size1,size2,size3,a[],b[],c[];
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of first array");
		size1=sc.nextInt();
		a=new int[size1];
		
		System.out.println("Enter elements in first array");
		for(int i=0;i<size1;i++){
			
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of second array");
		size2=sc.nextInt();
		b=new int[size2];
		
		System.out.println("Enter elements in second array");
		for(int i=0;i<size2;i++){
			b[i]=sc.nextInt();
		}
		
		c=new int[size1+size2];
		
		Merge m= new Merge();
		
		m.setValue(a,b,c);
		m.showArray();
	}
}