import java.util.*;
public class MapDemo1{
   public static void main(String[] args) {
      Map m1 = new HashMap(); 
      m1.put(8,"Zara");
      m1.put(31,"Mahnaz");
      m1.put(12,"Ayan");
      m1.put(31,"Daisy");
	  m1.put(16,null);
	  m1.put(null,null);
	  m1.put(8,"ram");
	  m1.put("8","raju");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}
