//Calling super class default constructor from sub class.

class A
{
	A()
	{
		System.out.println("This is super class default constructor");
	}
}
class B extends A
{
	B()
	{
	System.out.println("This is B class(SUB CLASS) default constructor");
	}
}
class C extends B
{
	C(){
		System.out.println("C Class Constructor");
	}
}
class super1
{
	public static void main(String args[])
	{
		C oc1 = new C();
	}
}