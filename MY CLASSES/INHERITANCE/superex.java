// Program that demonstrates the use of  " Super - predefined varaible".
import java.io.*;
class a
{
	int x1 = 50;
	int x2 = 60;
	
	void f1()
	{
		x1++;
	
	}
	void f2()
	{
		x2++;
	}
	void display()
	{
		System.out.println("The value of x1 is: " +x1);
		System.out.println("The value of x2 is: " +x2);
	}
}
class b extends a
{
	int x1 = 70;
	int x3 = 80;
	
	void f2()
	{
		x1++;  // b class x1.
		x2++;  // a class x2.
		super.x1++; // a class x1.
		x3++;
		f1(); // a class f1.	
	}
	void f3()
	{
		super.x1--; // a class x1.
		x3--;	    
		f2(); // b class f2.
		super.f2(); // a class f2
	}
	void display()
	{
		System.out.println("The value of x1 is: " +super.x1);
		System.out.println("The value of x2 is: " +x2);
		System.out.println("The value of x1 is: " +x1);
		System.out.println("The value of x3 is: " +x3);
	}
}
class superex
{
	public static void main(String args[])	
	{
		a oa1 = new a();
		oa1.f1();
		oa1.f2();
		oa1.display();
		//oa1.f3(); // Not valid.
		b ob1 = new b();
		b ob2 = new b();
		ob1.f1();  // a class f1.
		ob1.f2();  // b class f2.
		ob2.display();
		ob1.f3(); // b class f3.
		ob1.display(); // b class display.
		//ob1.super.f2(); --> This invalid because we cannot call the inherited 
			// super class method using super.
		
		//ob1.super.display();
		ob2.f2();
		ob2.display();
	}
}
				