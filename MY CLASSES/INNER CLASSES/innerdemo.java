/*
INNER CLASS:

A class enclosed inside the scope of another class is called inner class. The inner class is non existing to the outside world.
The inner class can access outer class members(including private members) directly.
The outer class can access the inner class members through an object.
================================================================
*/
// Program that demonstrates inner class.

class outer
{
	int m=10,n=100;
	void showouter()
	{
	System.out.println("Outer m = " +m+ " Outer n = " +n);
	}
	void callinner()
	{
	inner in1 = new inner();
	in1.showinner();
	}
	class inner
	{
	int x = 70;
	void showinner()
	{
	System.out.println("Inner x = "+x);
	System.out.println("Calling outer class showouter()");
	showouter();
	}
	}//inner class
}//outer class
class innerdemo
{
	public static void main(String []args)
	{
	outer out1 =new outer();
	out1.showouter();
	out1.callinner();
}
}
