	import java.net.Socket;
	import java.io.IOException;
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	
	public class clnt
	{
	public static void main(String args[])
	{
	
	Socket sock;                  //  Declare the socket
	
	//  Instantiate the socket using  host name  and port number
	 try 
	 {
	      sock = new Socket("localhost",1024);
	 }
	
	catch(IOException ioe) 
	   {
	      System.out.println("Error opening socket: " + ioe.getMessage());
	      return;
	   }
	
	 try
	  {
	      //  Instantiate an output stream tied directly to the socket
	
	      DataOutputStream oStream = new DataOutputStream(sock.getOutputStream());
	      
	      //  write a string and an int to the output stream, i.e. transmit them to the server 
	
	      oStream.writeUTF("Hello!");
	      oStream.writeInt(3);
	 }

	catch(IOException ioe) 
	 {
	     System.out.println("Write error: " + ioe.getMessage());
	 }

	try
	{
	      sock.close();
	}
	catch(IOException ioe) 
	{
	      System.out.println("Close error: " + ioe.getMessage());
	}
	}
	}
	