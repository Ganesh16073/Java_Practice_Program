import java.util.*;
class Per
{
	protected int sum=0;
	protected double prt=0;
	public void callPer(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		prt=(sum/((a.length)*100))*100;
		
	}	
}
class CSE extends Per
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
	void showCSEPer()
	{
		System.out.println("The Name of Student is : "+name);
		System.out.println("The ID of Student is : "+id);
		System.out.println("The Addres of Student is : "+address);
		System.out.println("The Year of Student is : "+year);
		System.out.println("The percentage is : "+prt);
	}
}

class ETC extends Per
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
	void showETCPer()
	{
		System.out.println("The percentage is : "+prt);
	}
}
class ResultApp
{
	public static void main(String args[])
	{
		String name;
		int id;
		String address,year;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int choice;
		System.out.println("Enter the Student Branch");
		System.out.println("1: CSE");
		System.out.println("2: ETC");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
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
			year=sc.nextLine();
			CSE c=new CSE(name, id,address,year);
			c.callPer(a);
			c.showCSEPer();
			break;
			
			case 2:
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
			ETC e=new ETC(name, id,address,year);
			e.callPer(a);
			e.showETCPer();
			break;
			
			default :
			System.out.println("Invalid Choice");
	
		}
		
		
	}
}