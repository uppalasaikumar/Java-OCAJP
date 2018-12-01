class Outer
	{
		int a=20;
		class Inner
		{
			
			int a=30;
			private void show()
			{
				System.out.println(Outer.this.a);
				System.out.println(this.a);
			}		
		}
		public static void main(String args[])
		{
				Outer O =new Outer();
				Outer.Inner OI=O.new Inner();
				OI.show();
		}
			
	}
