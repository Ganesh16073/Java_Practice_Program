import java.util.*;
import java.util.stream.*;
public class BiscuitApp
{
	public static void main(String args[])
	{
		Map<String,LinkedHashMap<String,Biscuit>> lhm=new  LinkedHashMap<>();
		
		LinkedHashMap<String,Biscuit> p=new LinkedHashMap<>();
		p.put("PG001",new Biscuit(1,"Parle-g",5));
		p.put("PG002",new Biscuit(2,"Parle-g gold",10));
		p.put("PG003",new Biscuit(3,"Parle-g chota bheem",15));
		
		LinkedHashMap<String,Biscuit> b=new LinkedHashMap<>();
		b.put("BR001",new Biscuit(1,"Britannia 50 50",5));
		b.put("BR002",new Biscuit(2,"Britannia Milk Bikis",10));
		b.put("BR003",new Biscuit(3,"Britannia Choco nuts",15));

		LinkedHashMap<String,Biscuit> o=new LinkedHashMap<>();
		o.put("Or001",new Biscuit(1,"Oreo Original Biscuit",10));
		o.put("Or002",new Biscuit(2,"Oreo Golden",10));
		o.put("Or003",new Biscuit(3,"Oreo Chocolate Cream",10));
		
		lhm.put("Parle-G",p);
		lhm.put("Britannia",b);
		lhm.put("Oreo",o);
		
		for (String brandName : lhm.keySet()) {
            System.out.println(brandName + ":");
            LinkedHashMap<String, Biscuit> products = lhm.get(brandName);

            for (String productCode : products.keySet()) {
                Biscuit biscuit = products.get(productCode);
                System.out.println(" " + productCode + " " + biscuit);
            }
        }
		
		Stream<String,LinkedHashMap<String,Biscuit>> s=lhm.stream();
		lhm.forEach((key,value)->System.out.println(key+"   "+value));
		
	}
}
class Biscuit
{
	int id;
	String name;
	int price;
	
	Biscuit(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return "Id => "+id+"/t Name => "+name+"/t Price => "+price;
	}
}