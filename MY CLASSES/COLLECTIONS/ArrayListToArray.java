import java.util.ArrayList;

class ArrayListToArray 
{
	public static void main(String args[]) 
	{
		int sum = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("Contents of al: " + al);
		/*for (int i : al)
				sum += i;
		System.out.println("Sum is: " + sum);*/
		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);
		for (int i : ia)
				sum += i;
		System.out.println("Sum is: " + sum);
  }
}
