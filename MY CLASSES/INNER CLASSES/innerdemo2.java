// static variables and ovveriding ...

class innerdemo2
{
  public static void main(String args[])
	{
		System.out.println(Outer.a);
		
		Outer O=new Outer();
		Outer.Inner OI=O.new Inner();
		System.out.println(O.b);
		System.out.println(OI.b);
	}	
}

 class Outer
	{
	static int a=10;
	int b=20;
	class Inner
	{
	 	
		int b=40;
	}
}
