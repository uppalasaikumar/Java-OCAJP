//program that demonstrates LinkedList & ListIterator
import java.util.*;
class linkedlistdemo
{
public static void main(String args[])
{
LinkedList<String> ll=new LinkedList<String>();
ll.add("a");
ll.add("b");
ll.add("c");
ll.add("d");
ll.add("e");
ll.addFirst("f");
ll.addLast("g");
ll.add(new Integer(45).toString());
System.out.println("The elements of the LinkedList in forward direction:");
ListIterator li=ll.listIterator();
while(li.hasNext())
{
System.out.println(li.next());
}
System.out.println("The elements of the LinkedList in reverse direction:");
while(li.hasPrevious())
{
System.out.println(li.previous());
}
for(String arr : ll)
	{
		System.out.println(arr);
	}
}
}
