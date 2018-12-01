
// Working with vectors and arrays.

import java.util.*;
class vecary
  {
    public static void main(String args[])
     {
       Vector lst = new Vector();
       int len = args.length;
       for(int i=0; i<len; i++)
       {
         list.addElement(args[i]);
       }
       lst.insertElementAt("cobol",2);
       int size = lst.size();
       String listArray[] = new String[size];
       lst.copyInto(listArray);
       System.out.println("List of Languages");
       for(int i=0; i<size; i++)
       {
        System.out.println(listArray[i]);
       }
      }
     }


