/**********************************************************************************************************************************

   ROLL NUMBER: 07AT1A1216		  DATE: 2-1-2009
   NAME: M.ABIDA BEGUM			  EXERCISE NUMBER: 3(a)

   WRITE A JAVA PROGRAM THAT CHECKS WHETHER A GIVEN STRING IS A   PALINDROME OR NOT

**********************************************************************************************************************************/


import java.io.*;

class palinstring
 {
   public static void main(String args[])throws Exception
   {
     try
      {
         String str;
         
         System.out.println("enter a string");
         DataInputStream ds=new DataInputStream(System.in);
         str=ds.readLine();
         
         StringBuffer sb=new StringBuffer();
         sb.append(str);
         sb.reverse();
         String str2=sb.toString();
         
         if(str.equals(str2))
               System.out.println("palindrome");
         else
               System.out.println("not a palindrome");
       }
       catch(Exception e)
       {  }
    }
 }


/************************************************************** 					INPUT/OUTPUT
*************************************************************/


/*  (1) 
       enter a string
       madam
       palindrome

     (2) 
         enter a string
         abida
         not a palindrome

*****************************************************************/



