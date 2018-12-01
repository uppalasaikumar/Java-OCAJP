

 import java.io.*;
 class fib
 {
   public static void main(String args[])throws Exception
    {
      int i=0,n,f1=0,f2=1,f3;
      DataInputStream ds=new DataInputStream(System.in);
      
     System.out.println("enter any numerical value");
      n=Integer.parseInt(ds.readLine());
      
     System.out.println(+f1);
      System.out.println(+f2);
      while(i<n-2)
       {
            f3=f1+f2;
           System.out.println(+f3);
           f1=f2;
           f2=f3;
           i++;
       }
    }
  }

/*########################################################
                        SAMPLE OUTPUT
##########################################################*/

/*enter any numerical value

5

0 1 1 2 3 
