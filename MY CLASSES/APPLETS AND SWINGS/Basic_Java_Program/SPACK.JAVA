import pack1.*;

import java.io.*;
public class spack
 {
   public static void main(String aa[])
    {
     try
       {
        DataInputStream d = new DataInputStream(System.in);
        int no1 = Integer.parseInt(d.readLine());
        int no2 = Integer.parseInt(d.readLine());
        sam s1=new sam();
        int res=s1.add(no1,no2);
        System.out.println("Result:"+res);
       }
       catch(Exception e)
       { }
     }
}
