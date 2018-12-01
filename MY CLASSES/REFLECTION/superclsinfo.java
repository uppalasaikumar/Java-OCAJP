//Super class information:

import java.awt.*;
public class superclsinfo  
{
	public static void main(String[] args) 
	{
		Checkbox big = new Checkbox("ITEM",true);
		printName(big);
		superclsinfo s1 = new superclsinfo();
		System.out.println("Object address." +s1);
		printName(s1);
		Integer i1 = new Integer(45);
		printName(i1);
	}
	static void printName(Object objct) 
	{
		Class cls = objct.getClass();
		Class sup = cls.getSuperclass(); 
		System.out.println(sup);
		System.out.println(objct);
 }
}
