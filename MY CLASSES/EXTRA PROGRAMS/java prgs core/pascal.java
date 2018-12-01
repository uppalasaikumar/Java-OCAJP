import java.io.*;
class pascal
{
  public static void main(String args[])throws Exception
   {
     int bin,p,q,r,x;
     DataInputStream ds=new DataInputStream(System.in);
     bin=1;
     q=0;
     System.out.println("enter rows u want to input");
     r=Integer.parseInt(ds.readLine());
     System.out.println("PASCALS TRIANGLE IS");
     while(q<r)
      {
        for(p=10-3*q;p>0;--p)
          System.out.println(" " );
        for(x=0;x<=q;++x)
          {
             if(x==0||q==0)
                bin=1;
             else
                bin=(bin*(q-x+1))/x;
             System.out.print("  " +bin);
          
           }
        ++q;
      }
   }
}
