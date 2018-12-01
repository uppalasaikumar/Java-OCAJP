/**********************************************************************************************************************************

ROLL NUMBER: 07AT1A1216			EXERCISE NUMBER: 2(b)
NAME: M.ABIDA BEGUM					DATE: 19/12/2008

W.A.P TO PERFORM  MATRIX  MULTIPLICATION

**********************************************************************************************************************************/

import java.io.*;
class matrix
{
  public static void main(String args[])throws Exception
  {
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int c[][]=new int[10][10];
    int r1,r2,c1,c2,i,j,k;
    DataInputStream ds=new DataInputStream(System.in);
    
    System.out.println("enter value for r1");
    r1=Integer.parseInt(ds.readLine());
    
    System.out.println("enter value for r2");
    r2=Integer.parseInt(ds.readLine());
    
    System.out.println("enter value for c1");
    c1=Integer.parseInt(ds.readLine());
    
    System.out.println("enter value for c2");
    c2=Integer.parseInt(ds.readLine());
    
    System.out.println("enter elements for array a");
    for(i=0;i<r1;i++)
     {
       for(j=0;j<c1;j++)
        {
          a[i][j]=Integer.parseInt(ds.readLine());
        }
     }
    
    System.out.println("enter elements for array b");
    for(i=0;i<r2;i++)
     {
       for(j=0;j<c2;j++)
        {
          b[i][j]=Integer.parseInt(ds.readLine());
        }
     }
    
    if(c1==r2)
     {
       System.out.println("multiplication is possible");
       for(i=0;i<r1;i++)
         for(j=0;j<c2;j++)
           {
             c[i][j]=0;
             for(k=0;k<r2;k++)
             c[i][j]=c[i][j]+a[i][k]*b[k][j];
           }
         for(i=0;i<r1;i++)
          {
            for(j=0;j<c2;j++)
             System.out.print(" "+c[i][j]);
             System.out.println();
          }
       }
      else
       System.out.println("multiplication is not possible");
    }
  }







/**********************************************************
				INPUT/OUTPUT
**********************************************************/

/*enter value for r1
2
enter value for r2
2
enter value for c1
2
enter value for c2
2
enter elements for array a
1
2
3
4
enter elements for array b
1
2
3
4
multiplication is possible
 7 10
 15 22  
*************************************************************/

