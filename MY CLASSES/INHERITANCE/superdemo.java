class A
{
	int x1 = 10;
	int x2 = 20;
	A(int x1,int x2)
	{
		this.x1=x1;
		this.x2=x2;
	}	
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
	int x1 = 33;
	int x3 = 44;
	B(int a,int b,int c)
	{
		super(a,b);
	}
	void f2()
	{
		x1++;
		x3 = 90;
		x3--;
	}
	void f3()
	{
		x1 = 999; // B class x1 
		x3 = 888;// B class x3
		super.x2++;// A class x2
		super.x1++;// super class variable
		x1--; // B class variable
		super.f2(); // super class f2() method
		f2(); // B class f2() method
	}
	void display()
	{
		System.out.println("The value of B class x1 is::"+x1);
		System.out.println("The value of B class x3 is::"+x3);
		System.out.println("The value of A class x2 is::"+super.x2);
		System.out.println("The value of A class x1 is::"+super.x1);
	}
}
class superdemo
{
	public static void main(String args[])
	{
		A oa1 = new A(11,22); // created object for super class
		oa1.display(); // 11 22
		oa1.f1(120,240);//A class f1
		oa1.display(); // A class display 120 24o
		//here display() method belongs to A class and is called from A class object
		oa1.f2();//A class f2
		oa1.increment();//A class increment.
		oa1.display(); // A class display. // 100 89

		B ob1 = new B(55,66); // B class object is created
		ob1.display(); // 55 66 33 44	
		ob1.f2();// B class f2.
		ob1.f3();// B class f3.
		ob1.display(); // B class display.

		System.out.println("The value of x2::"+ob1.x2);
		//System.out.println("The value of x2::"+super.x2);

		//ob1.super.f2();  cannot call super class ovverided method with 
			// object reference variable of B class

		B ob2 = new B(101,201);


		ob2.display();// B class display();
	}
}
	