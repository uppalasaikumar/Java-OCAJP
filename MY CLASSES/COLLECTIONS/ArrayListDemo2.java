import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo2 {
  public static void main(String args[]) {
    ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
    System.out.println("List contains " + arrlist.size() + " elements");
	arrlist.add(10);
    arrlist.add(50);
    arrlist.add(30);
    arrlist.ensureCapacity(15);
    for (Integer number : arrlist) {
      System.out.println("Number = " + number);
    }
	System.out.println("List contains " + arrlist.size() + " elements");
	Vector c2 = new Vector();
		c2.add(new Integer(90));
		c2.add(new Integer(12));
		c2.size();
	System.out.println(c2.capacity());
	
  }
}
