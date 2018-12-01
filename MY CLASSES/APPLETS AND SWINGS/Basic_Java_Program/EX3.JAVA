
// Determining the order of numbers generated randomly using Random class.

import java.util.*;
import java.io.*;
class ex3
 {
  public static void main(String ar[])
   {
    try
     {
      DataInputStream d=new DataInputStream(System.in);
      TreeSet ts = new TreeSet();
      System.out.println("Enter The Number For Input :");
      int n=Integer.parseInt(d.readLine());
      Random r=new Random();
      for (int i=1;i<=10;i++)
       {
       int n1 = r.nextInt(n);
       ts.add(new Integer(n1));
        System.out.println("No : "+i +"    "+ts);
       }
     }
    catch(Exception e)
     {
      System.out.println(e);
     }
    }
}
                        

