abstract class Value
{
	int a,b;
	public void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract int getResult();
}
class Add extends Value
{
	public int getResult()
	{
		return a+b;
	}
}
class Sub extends Value
{
	public int getResult()
	{
		return a-b;
	}
}
class Mul extends Value
{
	public int getResult()
	{
		return a*b;
	}
}
class div extends Value
{
	public int getResult()
	{
		return a/b;
	}
}

class Calculator
{
	public void performOperation(Value v)
	{
		int result=v.getResult();
		System.out.println(result);
	}
}



public class LouseCouple
{
	public static void main(String ars[])
	{
		
		Calculator c=new Calculator();
		Value v=new Add();
		v.setValue(5,4);
		c.performOperation(v);
		
		v=new Sub();
		v.setValue(5,4);
		c.performOperation(v);
		
	}
}