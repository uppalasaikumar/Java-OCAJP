class Base
{
    static int i=10;
	static 
	{
		m1();
		System.out.println("base static block");
	}
	public static void main(String[] args)
	{
		m1();
		System.out.println("base main");
	}
	public static void m1()
	{
		System.out.println(j);
	}
	static int j=20;
}
	class Derived extends Base
	{
		static int x=100;
		static 
		{
			m2();
			System.out.println("derived first static block");
		}
		public static void main(String[] args)
		{
			m2();
			System.out.println("Derived man");
		}
		public static void m2()
		{
			System.out.println(y);
		}
		static 
		{
			System.out.println("derived second static block");
		}
		static int y=200;
	}
	