import java.util.*;
class AddAmount
{
	int amount;
	AddAmount()
	{
		System.out.println("No Parameter Coonstructor");
	}
	AddAmount(int amount,int Aamount)
	{
		this.amount=amount;
		this.amount=this.amount+Aamount;
		System.out.println("The Added Total Amount is "+this.amount);	
	}
}
public class PiggieBankApp
{
	public static void main(String args[])
	{
		int amount=50;
		Scanner sc=new Scanner(System.in);
		int Aamount;
		System.out.println("The Initial Amount is "+amount);
		System.out.println("Enter the Amount to Add");
		Aamount=sc.nextInt();
		AddAmount a=new AddAmount();
		AddAmount a1=new AddAmount(amount,Aamount);
	}
}