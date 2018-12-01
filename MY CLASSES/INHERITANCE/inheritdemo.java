class A
{
	int x1,x2;
	
	A() // dummy definition for default constructor
	{}
	A(int x1,int x2)
	{
		this.x1 = x1;
		this.x2 = x2;
	}
	int sum(int a,int b) // two parameterised sum method
	{
		return (a+b);
	}
	int sum(int a)
	{
		return (a+a);
	}
	void set()
	{
		x1 = 111;
		x2 = 222;
	}

	void increment()
	{
		x1++;
		x2++;
	}

	void show()
	{
		System.out.println("Value in x1 .. "+x1);
		System.out.println("Value in x2 .. "+x2);
	}
}

class B extends A
{
	int m1,m2;
	
	B() // dummy defintion for B class default constructor
	{}
	B(int x1,int x2)
	{
		super(x1,x2);	
	}
	int sum(int a,int b)
	{
		return (super.sum(a) + this.sum(b));
	}
	int sum(int a)
	{
		return (m1+m2+a);
	}
	int sum(int a,int b,int c)
	{
		return (super.sum(a,b) + c);
	}
	void put()
	{
		m1 = 11;
		m2 = 22;
	}

	void display()
	{
		System.out.println("Value in m1 .." +m1);
		System.out.println("Value in m2 .." +m2);
	}
}
class inheritdemo
{
	public static void main(String args[])
	{

		A oa1 = new A();
		oa1.show(); // 0 0 
		oa1.set();
		oa1.show(); // 111 222

		//oa1.display(); INVALID
		// we cannot call sub class method using super class object

		B ob1 = new B();//d using default constructor

		ob1.set();
		ob1.increment();	
		ob1.increment();
		ob1.increment();
		ob1.show();
		ob1.display(); 
		ob1.put();
		ob1.display(); 

		B ob2 = new B(50,100); // using two parameterised 
				//constructor

		ob2.show(); 
		System.out.println("Sum with two values" +ob2.sum(9,8)); 
		System.out.println("Sum with two values" +oa1.sum(9,8)); 
		System.out.println("Sum with two values" +ob2.sum(9,8,9));
System.out.println("Sum with two values" +oa1.sum(9));
System.out.println("Sum with two values" +ob2.sum(9));
	}

}