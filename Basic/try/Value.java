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