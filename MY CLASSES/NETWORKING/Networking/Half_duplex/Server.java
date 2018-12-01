//TCP/IP Half Duplex Server



	import java.net.*;
	import java.io.*;

	public class Server
	{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss=new ServerSocket(1024);
		System.out.println("Waiting for  the Client Connection");
		Socket s=ss.accept();
		System.out.println("Connected with "+s.getInetAddress());
		PrintStream out=new PrintStream(s.getOutputStream(),true);
		DataInputStream in=new DataInputStream(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sd=" ";
	while(!sd.equalsIgnoreCase("Bye"))
	{
		System.out.println("From Client :" +in.readLine());
		System.out.println("To client:");
		sd=br.readLine();
		out.println(sd);
	}
	ss.close();
	s.close();
	out.close();
	in.close();
	}
	}
