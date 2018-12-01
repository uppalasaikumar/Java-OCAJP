// Server Program using SereverSocket.
import java.io.*;
import java.net.*;
public class sserver 
{
        public static void main(String ar[])
       {
        String s1,s2;
        Socket s;
        ServerSocket ss;
        PrintWriter pw;
        DataInputStream d,d1;
        try
                {
                        ss=new ServerSocket(5000);
                        s = ss.accept();
                        while(true)
                        {
                        d1=new DataInputStream(s.getInputStream());
                        s1=d1.readLine();
                        if(s1.equals(""))
                        {
                        System.out.println("No message from Client");             
                         }
                         else if(s1.equals("exit"))
                         {
                          System.exit(1);
                         }
                        else
                          {
                            System.out.println("From Client :" +s1);
                          }
                        pw=new PrintWriter(s.getOutputStream(),true); 
                        d=new DataInputStream(System.in);
                        s2=d.readLine();
                        if(s2.equals("exit"))
                        break;
                        pw.println(s2);
                      }
               }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
}

