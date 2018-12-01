import java.net.*;
class server
 {
	public static DatagramSoket ds;
	public static byte buffer[] = new byte[1024];
	public static void Myserver() throws Exception
 	 {
 	  int pos = 0;
          while(true)
	   {
	    int c = System.in.read();
	    switch(c)
             {
		case -1:   System.out.println("Server quits");
			   return;
		case '\r': break;
                case '\n': ds.send(new DatagramPacket
                           (buffer,pos,InetAddress.getLocalHost(),777));
 
			pos = 0;
			break;
		default: buffer[pos++] = (byte) c;
              }
          }
       }

public static void main(String args[]) throws Exception
 {
  System.out.println("Server ready .. \n please type here");
  ds = new DatagramSocket(888);
  Myserver();
 }
}