
public class LouseCouple
{
	public static void main(String ars[])
	{
		Value v=null;
		Calculator c=new Calculator();
		v=new Add();
		v.setValue(5,4);
		c.performOperation(v);
		
		v=new Sub();
		v.setValue(5,4);
		c.performOperation(v);
		
	}
}