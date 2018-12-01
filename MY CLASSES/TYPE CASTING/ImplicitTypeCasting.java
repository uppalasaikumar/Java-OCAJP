class ImplicitTypeCasting
{
	public static void main(String []args)
	{
		double d1 = 2.12D;
		float f1 = 150.5F;
		long l1 = 150L;
		int i1 = 550;
		char c1 = 200;
		short s1 = 100;
		byte b1 = 12;
	System.out.println();
	System.out.println("Default Type Casting");
	System.out.println("byte to short: \t ->" +(s1=b1));// 12
	System.out.println("short to int: \t ->" +(i1=s1));// 12
	System.out.println("int to long: \t ->" +(l1=i1));//12
	System.out.println("long to float: \t ->" +(f1=l1));//12.0
	System.out.println("float to double: \t ->" +(d1=f1));//12.0
	}
}