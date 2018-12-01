import java.io.*;
class arraysum
{
  public static void main(String args[])throws Exception
   {
     int a[]=new int[20];
     int n,i,s=0;
     DataInputStream ds=new DataInputStream(System.in);
     System.out.println("enter the size of the array");
     n=Integer.parseInt(ds.readLine());
     System.out.println("enter elements for array a");
     for(i=0;i<n;i++)
       a[i]=Integer.parseInt(ds.readLine());
     System.out.println("the elements of array a are");
     for(i=0;i<n;i++)
       System.out.println("  "+a[i]);
     for(i=0;i<n;i++)
        s=s+a[i];
     System.out.println("sum of the elements in the array a is"+s);
   }
}

