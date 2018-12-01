import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class ArrListEx
{
	public static void main(String[] args)
	{
		List myList = new ArrayList();
		myList.add("Hello");
		myList.add(null);
		myList.add("null");
		myList.add("Hai");
		System.out.println(myList);
		Set set = new HashSet(myList);
		System.out.println(set);
  }
}
