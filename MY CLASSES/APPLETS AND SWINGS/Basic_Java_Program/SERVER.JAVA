
//PROGRAM FOR SERVER COMMUNICATION USING DATAGRAM SOCKET 

import java.io.*;
import java.net.*;

public class server
{
        public static void main(String ar[])throws Exception
        {
                DatagramSocket ds=new DatagramSocket(5000);
                String s;
                DatagramPacket dp;
                while(true)
                {
                        byte b[]=new byte[512];
                        dp=new DatagramPacket(b,b.length);
                        ds.receive(dp);
                        s=new String(b).trim();
                        if(s.equals("exit"))
                        break;
                        System.out.println(s);
                }
        }
}
//Output In the sever side
//HAI
