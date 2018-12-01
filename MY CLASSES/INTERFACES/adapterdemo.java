/*
Adapter class:
===============

It is a class that inherits and provides blank implementation to the 
interface methods.

A class can extend adapter class and can override only the required
methods. This will prevent writing of unnecessary blank methods in the class.
*/
// Program that demonstrates an adapter class

interface intf
{
void method1();
void method2();
void method3();
void method4(int x);
void method5(float f);
void method6();
}
class myadapterdemo implements intf
{
public void method1(){}
public void method2(){}
public void method3(){}
public void method4(int x){}
public void method5(float f){}
public void method6(){}
}
class myclass extends myadapterdemo
{
public void method4(int x)
{
	System.out.println(x);
}
public void method5(float f)
{
	System.out.println(f);
}
}
class mydemo extends myadapterdemo
{
	public void method1()
	{
		System.out.println("This is method1()");
	}
	public void method2()
	{
		System.out.println("This is method2()");
	}
}
class adapterdemo
{
	public static void main(String args[])
{
	myclass m1 = new myclass();
	m1.method4(26);
	m1.method5(25.75F);

	mydemo d1 = new mydemo();
	d1.method1();
	d1.method2();
}
}