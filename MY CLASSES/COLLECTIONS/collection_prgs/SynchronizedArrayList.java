/*
•	ArrayList can be synchronized using the java collections framework utility class and then ArrayList itself can be used in place of Vector.
•	When there is no need for synchronized operation and you still look for better performance of ArrayList. 
•	In the sense of size incremenatation only we can synchronize the array list
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SynchronizedArrayList 
{
	public static void main(String[] args) 
	{
		// Create an ArrayList and populate it with elements
		ArrayList arrayList = new ArrayList();
		arrayList.add("element_1");
		arrayList.add("element_2");
		arrayList.add("element_3");
		// static void synchronizedList(List list) method returns a synchronized list from the provided ArrayList
		List syncList = Collections.synchronizedList(arrayList);
		System.out.println("syncList conatins : " + syncList);
	}
}
