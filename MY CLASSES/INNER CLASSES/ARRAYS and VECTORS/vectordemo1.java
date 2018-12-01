import java.io.*;
import java.util.*;

public class vectordemo1{
    
   
    public static void main(String args[]) {
        Vector v = new Vector();
        Integer i1 = new Integer(45); 
        Integer i2 = new Integer(450);
        Integer i3 = new Integer(4500);
        Double d1 = new Double(3.4);
        Double d2 = new Double(3.45);
        Double d3 = new Double(3.456);
        String s = "abc";
        v.addElement(i1);
        v.addElement(i2);
        v.addElement(i3);
        v.addElement(d1);
        v.addElement(d2);
        v.addElement(d3);
        v.addElement(s);
        Enumeration enum1 = v.elements();
        System.out.println("The elements of the vector are ::");
        while(enum1.hasMoreElements())
            System.out.println(enum1.nextElement());
        v.removeElementAt(2);
        System.out.println("The elements of the vector after removal are::");
        for(int i = 0;i<v.size();i++)
            System.out.println(v.elementAt(i));        
    }
    }