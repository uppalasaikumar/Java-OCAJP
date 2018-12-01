	//TCP/IP Full Duplex Server and Server
	
	import java.net.*;
	import java.io.*;

	class data_send extends Thread
	 {
	  ServerSocket sock;
	  DataInputStream dis;
	  Socket sk;

	public data_send()
	 {
	  try
           {
	    sock=new ServerSocket(2800);
	    dis=new DataInputStream(System.in);
            System.out.println("Waiting for  the Client");
	    sk=sock.accept();
	    start();
           }
	  catch(Exception ie){ie.printStackTrace();}
         }

	public void run()
         {
	  System.out.println("Connected with :" +sk.getInetAddress());
           while(true)
	    {
	     try
              {
		PrintStream ps=new PrintStream(sk.getOutputStream());
		System.out.println("Enter Msg:");
		ps.println(dis.readLine());
	      }
	     catch(Exception ik){ik.printStackTrace();}
            }
         }
      }
	public class tcp_full_serv
	 {
	  public static void main(String args[])throws Exception
	   {
	     new data_send();
             Socket sock=new Socket("localhost",3500);
	     System.out.println("Server Found");
             while(true)
	      {
DataInputStream ins=new DataInputStream(sock.getInputStream());
                System.out.println("From Client :" +ins.readLine());
              }
            }
         }

