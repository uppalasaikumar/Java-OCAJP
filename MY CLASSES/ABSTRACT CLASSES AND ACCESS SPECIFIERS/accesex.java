// Program that demonstrates usage of Access Specifiers.
class a
{
	private int x1 = 10;
	public int x2 = 20;
	protected int x3 = 30;
		int x4 = 40;
	private void f1()
	{
		x1++;
		x2++;
	}
	public void f2()
	{
		x2++;
		x4++;
		this.f1();
	}
	protected void f3()
	{
		x1--;
		x4++;
		f2();
		x3++;
	}
	void f4()
	{
		x2++;
		x3--;
		f2();
		x4++;
	}
	void display()
	{
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
	}
}

class B extends a
{

	int x5 = 20;

	void show()
	{
		System.out.println("The value in x5 is..." +x5);
	}
}		
class accesex
{
	public static void main(String args[])
	{
		a oa1 = new a();
		a oa2 = new a();
		//oa1.f1(); NOT VALID
		oa1.f2();
		oa1.display(); // 
		System.out.println("==============");
		oa1.f3();
		oa1.display(); // 
		System.out.println("==============");
		oa1.f4();
		oa1.display();//
		System.out.println("==============");
		//oa2.f1(); NOT VALID
		oa2.f3();
		oa2.display();//
		System.out.println("==============");
		//System.out.println(oa1.x1); NOT VALID
		System.out.println(oa1.x2);


		B ob1 = new B(); // B class object created

		ob1.show(); // B class show() method

		ob1.f2(); // A class public method

		ob1.display();

		// ob1.f1(); INVALID
}
}