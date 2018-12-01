//TCP/IP Half-Duplex Client



	import java.net.*;
	import java.io.*;

	public class Client
	{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket("localhost",1024);
		PrintStream out=new PrintStream(s.getOutputStream());
        	DataInputStream in=new DataInputStream(s.getInputStream());
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sd=" ";
		out.println("Client Connected");
	while(!sd.equalsIgnoreCase("Bye"))
	{
		System.out.println("From Server :" +in.readLine());
		System.out.println("To Server :");
		sd=br.readLine();
		out.println(sd);
}
	in.close();
	out.close();
	s.close();
}
}

