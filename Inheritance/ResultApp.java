import java.util.*;
class Per
{
	int sum;
	double prt;
	void callPer(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		ptr=sum/(a.length-1);
			
	}	
}
class CSE
{
	String name;
	int id;
	String address,year;
	CSE(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showCsePer()
	{
		
	}
}

class ETC
{
	String name;
	int id;
	String address,year;
	ETC(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showCsePer()
	{
		
	}
}
Class ResultApp
{
	public static void main(String args[])
	{
		String name;
		int id;
		String address,year;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the Mark of Student");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Name of Student");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter the Id of Student");
		id=sc.nextInt();
		System.out.println("Enter the Address of Student");
		sc.nextLine();
		address=sc.nextLine();
		System.out.println("Enter the Year of Student");
		sc.nextLine();
		year=sc.nextLine();
		
	}
}