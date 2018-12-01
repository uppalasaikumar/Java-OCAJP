	import java.net.*;
	import java.io.*;
	
	public class udpr
        {
         public static void main(String args[]) throws IOException
          {
DatagramSocket sock;    // Declare a Datagram socket

	try {
	                        
	      sock = new DatagramSocket(8000);     // Bind to local UDP port 8000
	    }

	catch(IOException ioe) {
      	System.out.println("Error creating socket: " + ioe.getMessage());
	return;
	}
           try
           {
             // Build structures to hold incoming information
      
             byte[] dataBytes = new byte[255];
             DatagramPacket pack = new DatagramPacket(dataBytes, dataBytes.length);
       
       // Recieve the incoming packet   
       sock.receive(pack);                 // Sender information available in
                                           //   pack.getAddress() and pack.getPort()
 System.out.println("Receive ");

      //  Unpackage the DataGramPacket
      ByteArrayInputStream biStream = new ByteArrayInputStream(pack.getData());
      DataInputStream iStream = new DataInputStream(biStream);
      String helloString = iStream.readUTF();
      int three = iStream.readInt();
      System.out.println(helloString +" "+ three);
}
catch(Exception ioe) {
      System.out.println("Receive error: " + ioe.getMessage());
}

try{
	sock.close();
}
catch(Exception ioe) {
	System.out.println("Close error: " + ioe.getMessage());
}
}
}

// Again, close() needs to be called on both applications, and an 
// application receives no indication that a remote application has
// closed its UDP socket.
