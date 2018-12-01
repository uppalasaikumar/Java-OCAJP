import mypack.employee;
import mypack.arith;
public class emp1
{
	public static void main(String []args)
	{
		employee e1 = new employee(100,"Nagaraj");
		e1.getid();
		e1.getname();
		System.out.println("=========================");

		arith a1 = new arith(30,20);

		int sum = a1.sum();
		int sub = a1.sub();

		System.out.println("The Sum is ... " +sum);
		System.out.println("Sub is .... " +sub);
	}
}