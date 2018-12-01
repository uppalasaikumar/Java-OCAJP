//program that demonstrates ArrayList and Iterator
import java.util.*;
class arraylistdemo
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
al.add("a");
al.add("b");
al.add("c");
al.add("d");
al.add("e");
al.add("f");
al.add("g");
al.add(new Integer(23));
al.add(new Double(23.456));
Collection c = al;
ArrayList a = new ArrayList(c);
System.out.println("The collection elements are ... " +a);
System.out.println("The elements of the array list are:"+al);
al.remove("f");
al.remove(2);
Iterator itr=al.iterator();
System.out.println("The elements of the array list after removal:");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
