//To remove the duplicates from arraylist:
//=========================

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicate{
  public static void main(String[] argv) {
    List<String> arrayList1 = new ArrayList<String>();

    arrayList1.add("A");
    arrayList1.add("A");
    arrayList1.add("B");
    arrayList1.add("B");
    arrayList1.add("B");
    arrayList1.add("C");

    HashSet<String> hashSet = new HashSet<String>(arrayList1);

    List<String> arrayList2 = new ArrayList<String>(hashSet);

    for (Object item : arrayList2)
      System.out.println(item);
  }
}
