
// Substring removal from a string. Using StringBuffer class.

import java.io.*;
class ex2
{
  public static void main(String ar[])
   {
    int y;
    try
     {
      DataInputStream d=new DataInputStream(System.in);
      do
       {
        System.out.println("Enter The String");
        StringBuffer sb1=new StringBuffer(d.readLine());
        System.out.println("Enter The Starting Index To Delete the String ");
        int si=Integer.parseInt(d.readLine());
        System.out.println("Enter The Ending Index To Delete the String ");
        int ei=Integer.parseInt(d.readLine());
        StringBuffer sb2=sb1.delete(si,ei);
        System.out.println("After Delete  The String Value Is "+sb2);
        System.out.println("Do U Want To Continue 1/0");
        y=Integer.parseInt(d.readLine());
       }while(y!=0);
      }
     catch(Exception e)
      {
       System.out.println(e);
      }
    }
}
