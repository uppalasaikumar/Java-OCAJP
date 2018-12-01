	import java.net.ServerSocket;
	import java.net.Socket;
	import java.io.IOException;
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	
	public class srvr
	{
	public static void main(String args[])
	{
	ServerSocket acceptSock;                   // Declare the ServerSocket
	
	//  Instantiate a ServerSocket using constructor that takes only the port number

	try {
	       acceptSock = new ServerSocket(1024);
	    }
	
	catch(IOException ioe) {
	      System.out.println("Error opening server socket: " + ioe.getMessage());
	      return;}
		
	Socket sock = null;            // Declare a socket to represent the connection to a
	                              // specific client, i.e. the socket client and server will
	                             // communicate over
	
	//  Call accept() on the ServerSocket to receive client connections,
	//  when a connection is received a new socket is returned over which
	//  the client and server will communicate

	System.out.println(" Server is in listen mode " );
	while(true) {
	      try {
        	    sock = acceptSock.accept();
	          }
	      catch(IOException ioe) {
	            System.out.println("accept error: " + ioe.getMessage());
	            break;                    
	      }
	      /* ... Process client connection ... */

	// Only break out of while loop if there was an error

      
	try{
	      //  Instantiate an input stream tied directly to the socket

	      DataInputStream iStream = new DataInputStream(sock.getInputStream());
      
      	//  Read a string and an int from the input stream, i.e from the socket

	      String helloString = iStream.readUTF();
	      int three = iStream.readInt();


	      System.out.println(helloString +" "+ three);
	}
	catch(IOException ioe) {
 	     System.out.println("Read error: " + ioe.getMessage());
	}
	}
	}
	}
