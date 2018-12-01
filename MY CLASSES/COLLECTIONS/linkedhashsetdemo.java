/*LinkedHashSet: This class introduced from j2sdk1.4.0 version onwards. This class implements 'List' interface and extends 'HashSet' class. This class arranges the elements in the order in which you inserti.e. original order.
*/
/*============================================*/
//program that demonstrates LinkedHashSet
import java.util.*;
class  linkedhashsetdemo
{
public static void main(String args[])
{
LinkedHashSet lhs=new LinkedHashSet();
lhs.add("a");
lhs.add("x");
lhs.add("p");
lhs.add("c");
lhs.add("o");
lhs.add("q");
lhs.add("A");
System.out.println("The elements of the LinkeHashSet are:");
Iterator itr=lhs.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
