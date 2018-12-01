//PROGRAM TO DISPLAY ADDRESS AND NAME USING FACTORY METHOD

import java.io.*;
import java.net.*;
public class factry
{
        public static void main(String ar[])throws UnknownHostException
        {
                InetAddress i1;
                InetAddress i2;
                i1=InetAddress.getByName("localhost");
                System.out.println(i1.toString());
                i2=InetAddress.getLocalHost();
                System.out.println(i2.toString());
                String str1=i2.getHostAddress();
                System.out.println("Host Address : "+str1);
                String str2=i2.getHostName();
                System.out.println("Host Name : "+str2);
        }
}
            

