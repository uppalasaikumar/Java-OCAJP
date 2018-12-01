// static inner class demonstration..
class staticinnerdemo
{
  public static void main(String args[])
	{
		//Outer.display();
		//Outer.Inner.show();
		
		Outer o = new Outer();
		o.display();
		
		Outer.Inner.show();
	}	
}

 class Outer
	{
	void display()
	{
		System.out.println("outer class display method");
	}
	static class Inner
	{
		static void show()
		{
			System.out.println("inner class show method");
		}
	}
}
