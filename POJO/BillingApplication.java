// Example: WAP to create billing application you have to design the following classes 
// Create class name as Product with field id, name and price,qty and mark this class as POJO class.
// and create one class name as Shop with two methods 
// void setProducts(Customer c,Product …p): this method can accept infinite products 
// Customer POJO class with field id,name and address ,contact 
// void calBill(): this method can calculate bill  and your bill format like as 

import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	private int qty;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
	
}
class Shop
{
	Product[] pd;
	Customer cm;
	private int sum=0;
	private int Tsum=0;
	private int total=0;
	void setProduct(Customer c,Product ...p)
	{
		cm=c;
		pd=p;	
	}
	void callBill()
	{
		System.out.println("Customer Detail");
		System.out.println("====================================================");
		System.out.println();
		System.out.println("Customer Name: "+cm.getName()+"\t"+"Id: "+cm.getId()+"\t"+"Address: "+cm.getAddress()+"\t"+"Contact: "+cm.getContact());
		System.out.println();
		System.out.println("Order Detail");
		System.out.println("Id\t ProductName\t Price\t Qty\t Total");
		for(int i=0;i<pd.length;i++)
		{
			total=(pd[i].getQty())*(pd[i].getPrice());
			Tsum=Tsum+total;
			System.out.println(pd[i].getId()+"      \t"+pd[i].getName()+"           \t"+pd[i].getPrice()+" \t"+pd[i].getQty()+" \t"+total);
			total=0;
		}
		System.out.println("======================================================");
		System.out.println("\t\t Total Bill Is: "+Tsum);
	}
	
}
class Customer
{
	private int id;
	private String name;
	private String address;
	private long contact;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setContact(long contact)
	{
		this.contact=contact;
	}
	public long getContact()
	{
		return contact;
	}
}
public class BillingApplication
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int id,qty,price;
		String name;
		
		int cid;
		String cname;
		String caddress;
		long ccontact;
		
		System.out.println("Enter the product Id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the product Name");
		name=sc.nextLine();
		System.out.println("Enter the product Price");
		price=sc.nextInt();
		System.out.println("Enter the product Quantity");
		qty=sc.nextInt();
		
		Product pd=new Product();
		pd.setId(id);
		pd.setName(name);
		pd.setPrice(price);
		pd.setQty(qty);
		
		System.out.println("Enter the Customer Id");
		cid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Customer Name");
		cname=sc.nextLine();
		System.out.println("Enter the Customer Address");
		caddress=sc.nextLine();
		System.out.println("Enter the Customer Contact Number");
		ccontact=sc.nextLong();
		
		Customer cm=new Customer();
		
		cm.setId(cid);
		cm.setName(cname);
		cm.setAddress(caddress);
		cm.setContact(ccontact);
		
		Shop sp=new Shop();
		sp.setProduct(cm,pd);
		sp.callBill();
		
	}
}