class IntegerDemo
{

	public static void main(String arg[])
	{

		Integer ob1=new Integer(10);

		System.out.println(ob1.intValue());

	Integer ob2=90;//Internally Integer ob2=new Integer(90);

		System.out.println(ob2);

		int var1=ob2;

		System.out.println("Value="+var1);

		System.out.println("Maximum Value"+Integer.MAX_VALUE);
		System.out.println("Minimum Value"+Integer.MIN_VALUE);
		
		Integer ob3=new Integer("233");

		System.out.println("The value of ob3  "+ob3);
	}
}