
//PROGRAM FOR CLIENT COMMUNICATION USING DATAGRAM SOCKET 

import java.io.*;
import java.net.*;
public class client
{
 public static void main(String ar[])throws Exception
 {
                DatagramSocket ds=new DatagramSocket();
                String s;
                DataInputStream d=new DataInputStream(System.in);
                DatagramPacket dp;
                while(true)
                {
                   s=d.readLine();
                   byte b[]=new byte[512];
                   b=s.getBytes();
                   dp=new DatagramPacket(b,b.length,InetAddress.
                                   getByName("localhost"),5000);
                        ds.send(dp);
                        if(s.equals("exit"))
                        break;
                }
        }
}

//INPUT IN THE CLIENT SIDE

//TYPE ANY MESSAGE
//HAI
