import java.util.ArrayList;
import java.util.List;

public class Arrlist_clear {
  public static void main(String args[]) throws Exception {

    List<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
	System.out.println(list);
    list.clear();

    System.out.println(list);
  }
}
