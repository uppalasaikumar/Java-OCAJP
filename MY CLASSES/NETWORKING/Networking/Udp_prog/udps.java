	import java.net.*;
	import java.io.*;
	
	public class udps
        {
         public static void main(String args[]) throws IOException
          {
	DatagramSocket sock;    // Declare a Datagram socket

	try {
	                        
	      sock = new DatagramSocket(6000);     // Bind to local UDP port 6000
	    }

	catch(IOException ioe) {
      	System.out.println("Error creating socket: " + ioe.getMessage());
	return;
	}
	try{
      	//  Build the IP address and port
      		InetAddress destAddr = InetAddress.getByName("localhost");
      		int destPort = 8000;
      	//  Configure the data stream
      		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
      		DataOutputStream oStream = new DataOutputStream(boStream);
      		oStream.writeUTF("Hello!");   // write data to the stream
      		oStream.writeInt(3);                     
      		byte[] dataBytes = boStream.toByteArray();   // Convert stream to byte array
      		DatagramPacket pack =                        //  Construct the DataGramPacket
                new DatagramPacket(dataBytes, dataBytes.length, destAddr, destPort);
		sock.send(pack);
	  }
		catch(IOException ioe) {
	        System.out.println("Send error: " + ioe.getMessage());
	}
}}

