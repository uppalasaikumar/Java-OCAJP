class ExplicitTypecasting
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
	System.out.println("Explicit Narrow TypeCasting");
	System.out.println("double to float: \t ->" +(f1 = (float)d1));
	System.out.println("float to long: \t ->" +(l1 = (long)f1));
	System.out.println("long to int: \t ->" +(i1 = (int)l1));
	System.out.println("int to short: \t ->" +(s1 = (short)i1));
	System.out.println("Short to byte: \t ->" +(b1 = (byte)s1));
	System.out.println();
	System.out.println("Explicit widening TypeCasting");
	System.out.println("cast byte to char: \t ->" + (char)b1);
	System.out.println("cast short to char: \t ->" + (char)s1);
	}
}