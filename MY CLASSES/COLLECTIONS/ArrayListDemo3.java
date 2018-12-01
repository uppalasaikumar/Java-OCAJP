import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo3 {
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
	
	
  }
}
