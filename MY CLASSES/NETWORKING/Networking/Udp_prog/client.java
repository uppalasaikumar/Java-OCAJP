import java.net.*;
class client
 {
	public static DatagramSoket ds;
	public static byte buffer[] = new byte[1024];
	public static void Myclient() throws Exception
 	 {
 	  
          while(true)
	   {
	     DatagramPacket p = new DatagramPacket(buffer,buffer.length);
             ds.receive(p);
             System.out.println(new String(p.getData(),0,p.getLength()));
              
          }
       }

public static void main(String args[]) throws Exception
 {
  System.out.println("Client - For quit press Ctrl+C");
  ds = new DatagramSocket(777);
  Myclient();
 }
}