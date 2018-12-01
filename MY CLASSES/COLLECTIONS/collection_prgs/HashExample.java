/*Removing Single Elements: public boolean remove(Object element)
*/
/*Determining via the equals() method of the element.
If the element is found, the element is removed and true is returned.
If not found, false is returned.
If removal is not supported, you'll get an UnsupportedOperationException thrown.*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class HashExample {

  public static void main(String[] a) {
    String elements[] = { "A", "B", "C", "D", "E" };
    Set set = new HashSet(Arrays.asList(elements));
    set.remove("A");
    System.out.println(set);
  }
}
