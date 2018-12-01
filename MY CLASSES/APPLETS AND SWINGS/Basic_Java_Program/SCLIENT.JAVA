
// Client Program using SereverSocket.
import java.io.*;
import java.net.*;
public class sclient 
{
        public static void main(String ar[])
        {
        String s1,s2;
        Socket s;
        PrintWriter pw;
        DataInputStream d,d1;
        try
             {
                s=new Socket("localhost",5000);
                while(true)
                 {
                 pw=new PrintWriter(s.getOutputStream(),true);
                 d1=new DataInputStream(System.in);
                 s2=d1.readLine();
                 if(s2.equals("exit"))
                  {
                  break;
                  }
                 pw.println(s2); 
                 d=new DataInputStream(s.getInputStream());
                 s1=d.readLine();
                 if(s1.equals("exit"))
                  {
                  System.exit(1);
                  }
                  System.out.println("From Server"+s1);
                  }
               }
                 catch(Exception e)
                {
                        System.out.println(e);
                }
        }
}
