/* ADDITION OF TWO MATRICES*/
import java.io.*;
class addition
{
  public static void main(String args[])throws Exception
    {
      int a[][]=new int[3][3];
      int b[][]=new int[3][3];
      int c[][]=new int[3][3];
      int i,j;
      DataInputStream ds=new DataInputStream(System.in);
      System.out.println("enter elements for matrix a");
      for(i=0;i<3;i++)
       {
        for(j=0;j<3;j++)
         {
          a[i][j]=Integer.parseInt(ds.readLine());
         }
       }
      System.out.println("enter elements for matrix b");
      for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
           b[i][j]=Integer.parseInt(ds.readLine());
          }
        }
      for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
           c[i][j]=a[i][j]+b[i][j];
          }
        }
      for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
         {
           System.out.print("  "+c[i][j]);
           System.out.println();
         }
        }
     }
  }

