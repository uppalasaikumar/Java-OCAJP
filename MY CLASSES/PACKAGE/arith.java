package mypack;
public class arith
{
	public int a,b,c;

	public arith(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int sum()
	{
		return (a+b);
	}
	public int sub()
	{
		if(a>b)
		{
			return (a-b);
		}
		else
		{
			return (b-a);
		}
	}
}