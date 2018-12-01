class A
{
	int x1 = 10;
	int x2 = 20;
	void f1(int x1,int x2)
	{
		this.x1 = x1;
		this.x2 = x2;
	}
	void f2()
	{
		x1 = 99;
		x2 = 88;
	}
	void increment()
	{
		x1++;
		x2++;
	}
	void display()
	{
		System.out.println("Value of x1 is::"+x1);
		System.out.println("value of x2 is::"+x2);
	}
}
class B extends A
{
	x1 = 33;
	x3 = 44;
	void f2()
	{
		x1++; // B class x1 variable
		x3 = 90; // x3 B class variable
		x3--;
	}
	void f3()
	{
		x1 = 999;
		x3 = 888;
		super.x1++;
		x2++;
		super.f2();
	}
	void display()
	{
		System.out.println("The value of x1 is::"+x1);
		System.out.println("The value of x2 is::"+x3);
		System.out.println("The value of x2 is::"+super.x2);
		System.out.println("The value of x2 is::"+super.x1);
	}
}
class inheritdemo
{
	public static void main(String args[])
	{
		