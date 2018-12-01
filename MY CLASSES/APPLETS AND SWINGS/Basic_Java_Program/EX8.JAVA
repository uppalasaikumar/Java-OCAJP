
// Usage of Vector Classes

import java.util.*;
class ex8
 {
        public static void main(String ar[])
        {
                Vector v1=new Vector(10);
                v1.addElement("Computer Science  Engineering");
                v1.addElement("Electronics & Instrumentation");
                v1.addElement("Electronics & Communication");
                v1.addElement("Chemical Engineering");
                v1.addElement("Civil Engineering");
                v1.addElement("Mechanical Engineering");
                Enumeration e=v1.elements();
                while(e.hasMoreElements())
                {
                        System.out.println(e.nextElement());
                }
        }
}






