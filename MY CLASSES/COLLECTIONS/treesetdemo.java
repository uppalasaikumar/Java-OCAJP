//program that demonstrates TreeSet
import java.util.*;
class treesetdemo
{
public static void main(String args[])
{
TreeSet ts=new TreeSet();
ts.add("x");
ts.add("b");
ts.add("d");
ts.add("c");
ts.add("p");
ts.add("l");
ts.add("m");
System.out.println("the elements of the TreeSet are:");
System.out.println(ts);
Iterator itr=ts.iterator();
while(itr.hasNext())
{
System.out.print("\t"+itr.next());
}
itr=ts.iterator();
while(itr.hasNext())
{
System.out.print("\t"+itr.next());
}
}
}
          