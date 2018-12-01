import java.io.*;
class swap
{
  public static void main(String args[])throws Exception
   {
     int a,b,temp;
     DataInputStream ds=new DataInputStream(System.in);
     System.out.println("enter a number");
     a=Integer.parseInt(ds.readLine());
     System.out.println("enter a number");
     b=Integer.parseInt(ds.readLine());
     System.out.println("the values of a and b before interchanging are "+a+" "+b);
     temp=a;
     a=b;
     b=temp;
     System.out.println("the values of a and b after interchanging are "+a+" "+b);
   }
}

