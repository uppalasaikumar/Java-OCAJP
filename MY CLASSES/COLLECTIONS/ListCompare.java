import java.util.Arrays;
import java.util.List;

public class ListCompare{

  public static void main(String[] a) {

    List list = Arrays.asList(new String[] { "A", "B", "C", "D" });
    List list2 = Arrays.asList(new String[] { "A", "B", "C" });
   System.out.println(list.equals(list2));

	List l1 = Arrays.asList(new Integer[] {12,14,15,16});
	List l2 = Arrays.asList(new Integer[] {12,14,15,16});
   System.out.println(l1.equals(l2));
  }
}
