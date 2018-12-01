public class AnonymousTest
{
	private String s = "test member access";

	public void test(final String s)
	{
		// anonymous instance as a variable
		Runnable r = new Runnable()
		{
			public void run()
			{
				System.out.print(getClass().getName() + " inner in ");
				System.out.println(getClass().getEnclosingClass());
				System.out.println("in anonymous class 1");
				System.out.println(AnonymousTest.this.s);
			}
		};
		Thread t1 = new Thread(r, "anonymous 1");
 
			t1.start();
	}
 
	public static void main(String[] args)
	{
		new AnonymousTest().test("final parameter");
	}
}
