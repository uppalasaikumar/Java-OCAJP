
// Demonstrate InetAddress.
import java.net.*;
import java.io.*;

class DNS
{
  public static void main(String args[]) throws IOException 
   {
     try
      {
       InetAddress[] SW = InetAddress;
       getAllByName("java.sun.com");
       for(int i=0;i<sw.length;i++)
       System.out.println(SW[i]);
      }
     catch(Exception e)
      {
        System.out.println("Error in catch" +e);
      }
  }
}





