//program that demonstrates HashSet
import java.util.*;
class hashsetdemo
{
public static void main(String args[])
{
HashSet hs=new HashSet(10);
hs.add("a");
hs.add("b");
hs.add("c");
hs.add("d");
hs.add("e");
hs.add("f");
hs.add("t");
hs.add("u");
hs.add("r");
hs.add("y");
hs.add("z");
hs.add("z");
System.out.println("the elements of the HashSet are:");
Iterator itr=hs.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}

/* 
Constructors:
-----------------------
HashSet()
HashSet(Collection c)
HashSet(int initialsize)
*/


