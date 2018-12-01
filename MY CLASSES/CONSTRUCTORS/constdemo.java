// user defined constructors demonstration

class A
{


	int x1,x2; // instance variables of the class A 
	
	A() // Dummy definition for the default constructor
	{}
	A(int x1,int x2)// two parameterised user defined constructor
	{
		this.x1 = x1;
		this.x2 = x2;
	}	
	A(int x1) // single parameterised userdefined constructor
	{
		this.x1 = x1;
	}
	void set()
	{
		x1 = 100;
		x2 = 200;
	}
	void set(int a,int b)
	{
		x1 = a;
		x2 = b;
	}
	void increment()
	{
		x1++;
		x2++;
	}
	void show()
	{
		System.out.println("The value in x1.." +x1);
		System.out.println("The value in x2.." +x2);
	}
}
class constdemo
{
	public static void main(String args[])
	{
		A oa1 = new A();
		// using default constructor creating dynamic 
		//memory for instance members of A class

		oa1.show(); // 0 0
		oa1.set();
		oa1.show();

		A oa2 = new A(444,555); // user defined constructor with two parameters
					// is called

		oa2.show();

		A oa3 = new A(999);// user defined construtor with one parameter

		oa3.show();
		
		A oa4 = new A();
		oa4.show(); // 0 0
		oa4.set(111,201);
		oa4.show(); 
		//A oa5 = new A(1,2,3);INVALID
		//oa5.show();
	}
}