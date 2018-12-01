import java.util.ArrayList;
public class ArrayListDemo1 
{
	public static void main(String args[]) 
	{
		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		arrlist.add(35);
		arrlist.add(20);
		arrlist.add(25);

		arrlist.trimToSize();
		for (Integer number : arrlist) 
		{
			System.out.println("Number = " +number);
		}
	}
}
