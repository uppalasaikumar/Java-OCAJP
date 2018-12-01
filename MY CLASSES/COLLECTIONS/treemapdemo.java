//program that demonstrates TreeMap
import java.util.*;
class treemapdemo
{
public static void main(String args[])
{
TreeMap tm=new TreeMap();
tm.put("Allen",new Double(5000.0));
tm.put("Alex",new Double(10000.0));
tm.put("3rd",new Double(7000.0));
tm.put("III",new Double(3000.0));
tm.put("Robert",new Double(2000.0));
Set s=tm.entrySet();
Set s1=tm.keySet();
Collection s2=tm.values();
System.out.println("Key are..." +s1);
System.out.println("Values are .. " +s2);
Iterator itr=s.iterator();
while(itr.hasNext())
{
Map.Entry me=(Map.Entry)itr.next();
System.out.println("Employee Name:"+me.getKey()+"   Salary:"+me.getValue());
}
}
}
