
// Demonstrate InetAddress.
import java.net.*;
import java.io.*;

class Inet1
{
  public static void main(String args[]) throws UnknownHostException,IOException {
    System.out.println("Enter the host name :");
    String s = new DataInputStream(System.in).readLine();
    InetAddress SW = InetAddress.getByName(s);
    System.out.println(SW);
  }
}





