import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 
{
	public static void main(String[] a) 
	{
		ArrayList<String> nums = new ArrayList<String>();
		nums.add("O");
		nums.add("Two");
		nums.add("Three");
		nums.add("Four");

		String s;
		Iterator e = nums.iterator();
		while (e.hasNext()) 
		{
			s = (String) e.next();
			System.out.println(s);
		}
	}
}
