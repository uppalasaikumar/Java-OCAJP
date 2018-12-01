class innerdemo1
{
  public static void main(String args[])
	{
		Outer O = new Outer();
		O.display();
		Outer.Inner OI = O.new Inner();
		OI.show();
	}	
}

class Outer
{
	void display()
	{
		System.out.println("outer class display method");
	}
	class Inner
	{
		void show()
		{
			System.out.println("inner class show method");
		}
	}
}
