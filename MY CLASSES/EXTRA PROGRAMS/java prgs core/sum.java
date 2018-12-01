import java.io.*;
class sum
{
public static void main(String args[])
{
 int i,s=0,a[]=new a[5];
 DataInputstream ds=new DataInputStream(System.in);
 for(i=0;i<5;i++)
 {
  System.out.println("enter a value");
  a[i]=Integer.parseInt(ds.readLine());
 }
 for(i=0;i<5;i++)
   s=s+a[i];
 System.out.println("total sum is"+s);
}
}
