import java.util.*;
class IntrestApp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double principal,rate,duration;
		System.out.println("Enter the Principal");
		principal=sc.nextDouble();
		System.out.println("Enter the Rate of Intrest");
		rate=sc.nextDouble();
		System.out.println("Enter the duration");
		duration=sc.nextDouble();
		CalculateIntrest c=new CalculateIntrest();
		c.setPRD(principal,rate,duration);
		c.calIntrest();
	}
}
class Intrest
{
	protected double principal,rate,duration;
	void setPRD(double principal,double rate,double duration)
	{
		this.principal=principal;
		this.rate=rate;
		this.duration=duration;
	}
}
class CalculateIntrest extends Intrest
{
	double intrest;
	void calIntrest()
	{
		intrest=principal*duration*rate/100;
		System.out.println("The Intrest Is: "+intrest);
	}
}
