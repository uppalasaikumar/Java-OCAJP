import java.io.*;
class last
{
  public static void main(String args[])throws Exception
    {
      int l,n,r;
      DataInputStream ds=new DataInputStream(System.in);
      System.out.println("enter a number");
      n=Integer.parseInt(ds.readLine());
      l=0;
      r=n%10;
      l=r;
      System.out.println("last digit is"+l);
    }
}
