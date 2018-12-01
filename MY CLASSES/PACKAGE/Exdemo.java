// demonstration of sub package call

import mypack.student.*;
class Exdemo
{
	public static void main(String args[])
	{
		Student s1 = new Student(100,"Sruthi");

		s1.s_id();
		s1.s_name();
	}
}