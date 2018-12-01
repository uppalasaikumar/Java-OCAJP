	//TCP/IP Full Duplex Server and Server

	import java.net.*;
	import java.io.*;

	class rec_read extends Thread
	 {
	  Socket sock;

	  public rec_read()
	  {
	   System.out.println("searching the localhost");
	   start();
	  }
	 public void run()
	 {
	   try
	    {
             sock=new Socket("localhost",2800);
             System.out.println("System  Found");
             while(true)
	      {
		DataInputStream ins=new DataInputStream(sock.getInputStream());
		System.out.println("From Message : "+ins.readLine());
	      }
	   }
	  catch(Exception ie){ie.printStackTrace();}
	 }
	}
	public class tcp_full_clnt
	 {
	   public static void main(String args[])throws Exception
	    {
		new rec_read();
		Thread.sleep(500);
		ServerSocket sock=new ServerSocket(3500);
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Waiting for Client");
		Socket sk=sock.accept();
		System.out.println("Connected with:"+sk.getInetAddress());
		while(true)
		 {
		  PrintStream ps= new PrintStream(sk.getOutputStream());
		  System.out.print("To Msg :");
	 	  ps.println(dis.readLine());
		 }
	     }
	}


