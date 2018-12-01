import java.io.*;
class first
{
  public static void main(String args[])throws Exception
    {
      int n,f,r;
      DataInputStream ds=new DataInputStream(System.in);
      System.out.println("enter a number");
      n=Integer.parseInt(ds.readLine());
      r=n/10;
      f=r/10;
      System.out.println("first digit is"+f);
    }
}

