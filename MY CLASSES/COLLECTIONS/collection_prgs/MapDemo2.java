import java.util.*;
class MapDemo2 
{
	public static void main(String args[]) 
	{ 
		String days[]={"Sunday", "Monday", "Tuesday", "Wednesnday","Thursday", "Friday", "Saturday"};
		Map map = new HashMap();
		try
		{
			for(int i=0; i<7; i++)
			{
				map.put(i, days[i]);
			}
			TreeMap tMap=new TreeMap(map);
			//Rerieving all keys
System.out.println("Keys of tree map: " + tMap.keySet());
			//Rerieving all values
System.out.println("Values of tree map: " + tMap.values());
			//Rerieving the First key and its value
System.out.println("First key: " + tMap.firstKey() +" Value: " + tMap.get(tMap.firstKey()) + "\n");
			//Removing the first key and value
System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
System.out.println("Now the tree map Keys: " + tMap.keySet());
System.out.println("Now the tree map contain: " + tMap.values() + "\n");
			//Rerieving the Last key and value
System.out.println("Last key: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()) + "\n");  
			//Removing the last key and value
System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
System.out.println("Now the tree map Keys: " + tMap.keySet());
System.out.println("Now the tree map contain: " + tMap.values());
		}
		catch(Exception e){}
	}
}
