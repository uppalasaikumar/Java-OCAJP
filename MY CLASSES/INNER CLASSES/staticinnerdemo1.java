// static inner class consisting of instance objects
class staticinnerdemo1
{
  public static void main(String args[])
	{
		Outer o = new Outer();
		o.display();
		Outer.Inner OI = new Outer.Inner();
		OI.show();
		
	}	
}
class Outer
{
	void display()
	{
		System.out.println("Outer class display");
	}
	static class Inner
	{
		void show()
		{
			System.out.println("inner class show method");
		}
	}
}
