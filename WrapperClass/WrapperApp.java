public class WrapperApp
{
	public static void main(String args[])
	{
		int k=40;
		Integer f=k;
		System.out.println("THe auto boxing if primite value to refrencial  value is "+f);
		
		Integer a=10;
		int b=a;
		System.out.println("THe auto un-boxing if refrencial  value to primite value is "+b);
		
		Float d=23.5f;
		Long l=33344L;
		String str="1233";
		
		int ab=d.intValue(); // numeric Reference value to Primitive type integer . Float to int;
		System.out.println("Converting Float to int using intValue() "+ab);
		
		ab=l.intValue();
		System.out.println("Converting Long to int using intValue() "+ab);
		
		ab=Integer.parseInt(str); // using parseInt for converting only strinh to othertypes
		System.out.println("Converting String to int using parseInt() "+ab);
		
		//valueOf(): this method is used for convert any primitive type value to reference type value it is a static method present 
		//in every wrapper class.
		
		int value=2002;
		String vl=String.valueOf(value);
		System.out.println("Primitive to Refrence using valueOf() ="+vl);
		
		
		// intValue() is used to convert refrence to premitive
		// valueOf() is used to convert premitive to refrence
		// parseInt() if used to conver String to premitiveN
		
	}

}