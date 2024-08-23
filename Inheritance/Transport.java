import java.util.*;
class Vehical
{
	protected String vehicalModel;
	protected long registerNumber;
	protected double vehicalSpeed;
	protected double fuleCapacity;
	protected double fuleConsuption;
	protected double fuleNeeded;
	protected double distanceCovered;
	
	
	Vehical(String vehicalModel,long registerNumber,double vehicalSpeed,double fuleCapacity,double fuleConsuption)
	{
		this.vehicalModel=vehicalModel;
		this.registerNumber=registerNumber;
		this.vehicalSpeed=vehicalSpeed;
		this.fuleCapacity=fuleCapacity;
		this.fuleConsuption=fuleConsuption;
	}
	
	void setVehicalModel(String vehicalModel)
	{
		this.vehicalModel=vehicalModel;
	}
	public String getVehicalModel()
	{
		return vehicalModel;
	}
	void setRegisterNumber(long registerNumber)
	{
		this.registerNumber=registerNumber;
	}
	public long getRegisterNumber()
	{
		return registerNumber;
	}
	void setVehicalSpeed(double vehicalSpeed)
	{
		this.vehicalSpeed=vehicalSpeed;
	}
	public double getVehicalSpeed()
	{
		return vehicalSpeed;
	}
	void setFuleCapacity(double fuleCapacity)
	{
		this.fuleCapacity=fuleCapacity;
	}
	public double getFuleCapacity()
	{
		return fuleCapacity;
	}
	void setfuleConsuption(double fuleConsuption)
	{
		this.fuleConsuption=fuleConsuption;
	}
	public double getFuleConsuption()
	{
		return fuleConsuption;
	}
	
	public void fuelNeeded(int distance)
	{
		double fule=(double)distance*fuleConsuption; 
		fuleNeeded=fule;
	}
	
	public void distanceCovered(double time)
	{
		double distance=vehicalSpeed*time;
		distanceCovered=distance;
	}
	
	public void display()
	{
		System.out.println("The vehicalModel is : "+vehicalModel);
		System.out.println("The RegisterNumber is : "+registerNumber);
		System.out.println("The VehicalSpeed is : "+vehicalSpeed);
		System.out.println("The FuleCapacity is : "+fuleCapacity);
		System.out.println("The FuleConsuption is : "+fuleConsuption);
		System.out.println("The FuleNeeded is : "+fuleNeeded);
		System.out.println("The Distance Covered is : "+distanceCovered);
	}
}

class Truck extends Vehical
{
	protected double cargoWeightLimit;
	Truck(String vehicalModel,long registerNumber,double vehicalSpeed,double fuleCapacity,double fuleConsuption,double cargoWeightLimit)
	{
		super(vehicalModel,registerNumber,vehicalSpeed,fuleCapacity,fuleConsuption);
		this.cargoWeightLimit=cargoWeightLimit;
	}
	void setCargoWeightLimit()
	{
		this.cargoWeightLimit=cargoWeightLimit;
	}
	public double getCargoWeightLimit()
	{
		return cargoWeightLimit;
	}
	
	public void display()
	{
		super.display();
		System.out.println("The Cargo Weight is : "+cargoWeightLimit);
	}

}

class Bus extends Vehical
{
	protected int noOfPassenger;
	Bus(String vehicalModel,long registerNumber,double vehicalSpeed,double fuleCapacity,double fuleConsuption,int noOfPassenger)
	{
		super(vehicalModel,registerNumber,vehicalSpeed,fuleCapacity,noOfPassenger);
		this.noOfPassenger=noOfPassenger;
	}
	void setNoOfPassenger()
	{
		this.noOfPassenger=noOfPassenger;
	}
	public double getNoOfPassenger()
	{
		return noOfPassenger;
	}
	public void display()
	{
		super.display();
		System.out.println("The Number of Passerger is: "+noOfPassenger);
	}
}
class Transport
{
	public static void main(String args[])
	{
		int choice;
		String vehicalModel;
		long registerNumber;
		double vehicalSpeed;
		double fuleCapacity;
		double fuleConsuption;
		double cargoWeightLimit;
		int noOfPassenger;
		int distance;
		double time;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Vehical ");
		System.out.println("1) Truck ");
		System.out.println("2) Bus ");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				
				System.out.println("Enter the Vehical Model");
				sc.nextLine();
				vehicalModel=sc.nextLine();
				System.out.println("Enter The Register Number");
				registerNumber=sc.nextLong();
				System.out.println("Enter The Vehical Speed ");
				vehicalSpeed=sc.nextDouble();
				System.out.println("Enter The Fule Capacity ");
				fuleCapacity=sc.nextDouble();
				System.out.println("Enter The Fule Consuption Per Liter ");
				fuleConsuption=sc.nextDouble();
				System.out.println("Enter The Cargo Weight Limit ");
				cargoWeightLimit=sc.nextDouble();
				System.out.println("Enter The Distance Covered");
				distance=sc.nextInt();
				System.out.println("Enter The Time Covered ");
				time=sc.nextDouble();
				
				Truck t=new Truck(vehicalModel,registerNumber,vehicalSpeed,fuleCapacity,fuleConsuption,cargoWeightLimit);
				t.fuelNeeded(distance);
				t.distanceCovered(time);
				t.display();
				break;
				
			case 2:
				System.out.println("Enter the Vehical Model");
				sc.nextLine();
				vehicalModel=sc.nextLine();
				System.out.println("Enter The Register Number");
				registerNumber=sc.nextLong();
				System.out.println("Enter The Vehical Speed ");
				vehicalSpeed=sc.nextDouble();
				System.out.println("Enter The Fule Capacity ");
				fuleCapacity=sc.nextDouble();
				System.out.println("Enter The Fule Consuption Per Liter ");
				fuleConsuption=sc.nextDouble();
				System.out.println("Enter The Number Of Passenger ");
				noOfPassenger=sc.nextInt();
				System.out.println("Enter The Distance Covered");
				distance=sc.nextInt();
				System.out.println("Enter The Time Covered ");
				time=sc.nextDouble();
				
				Bus b=new Bus(vehicalModel,registerNumber,vehicalSpeed,fuleCapacity,fuleConsuption,noOfPassenger);
				b.fuelNeeded(distance);
				b.distanceCovered(time);
				b.display();
				break;
				
			default:
				System.out.println("InValid Choice");
				
		}
				
				
	}
}