

/**********************************************************************************************************************************

  ROLL NUMBER: 07AT1A1216                     DATE: 12-12-2008
    NAME : M.ABIDA BEGUM                          EXERCISE NUMBER: 2(a)
  
  W.A.P TO DISPLAY THE PRIME NUMBERS BETWEEN THE GIVEN NUMBERS

**********************************************************************************************************************************/

 import java.io.*;
 class prime
 {
   public static void main(String args[])throws Exception
   {
     int i,j,k,m,count;
     DataInputStream ds=new DataInputStream(System.in);
     System.out.println("enter first integer value");
     i=Integer.parseInt(ds.readLine());
     System.out.println("enter second integer value");
     j=Integer.parseInt(ds.readLine());
     System.out.println("the prime numbers are");
     for(k=i;k<=j;k++)
      {
        count=0;
        for(m=1;m<=j;m++)
        {
          if((k%m)==0)
          count++;
        }
        if(count==2)
        System.out.println("\t"+k);
      }
    }
  }


/***********************************************************
     SAMPLE OUTPUT
************************************************************/
/*enter first integer value
1
enter second integer value
50
the prime numbers are
        2
        3
        5
        7
        11
        13
        17
        19
        23
        29
        31
        37
        41
        43
        47*/

