class A
{
	int x1,x2;
	int sum(int a,int b)
	{
		return (a+b);
	}
	int sum()
	{
		return 0;
	}

	int sum(int a)
	{
		return a + x1 + x2;
	}
	void set(int a,int b)
	{
		x1 = a;
		x2 = b;
	}
	void display()
	{
		System.out.println("Value in x1 .. " +x1);
		System.out.println("Value in x2 .. " +x2);
	}
}
class B extends A
{
	int m1 = 10;
	void put(int p1)
	{
		m1 = p1;
	}
	int sum(int a,int b)
	{
		return (m1 + a + b + super.sum(9));
	}
	int sum()
	{
		return (90 + sum(9,9));
	}
	int add(int a,int b)
	{
		return super.sum(a,b) + this.sum(a,30);
	}
	void show()
	{
		System.out.println("Value in m1 is .. " +m1);
	}
}
class demo11
{
	public static void main(String args[])
	{
		
		B ob1 = new B();
		// created object for B class
		ob1.set(11,22);
		ob1.display(); //

		System.out.println("The sum is .. " +ob1.sum(9,1)); //
		System.out.println("The sum is .." +ob1.sum()); // 	

		ob1.show(); //
		ob1.put(99);
		ob1.show(); //
		System.out.println("The sum is .. " +ob1.add(7,6));
		System.out.println("The sum is .. " +ob1.sum(55));

	}

}