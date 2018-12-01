
Roll.no. 07AT1A1210                                   Date: 21/1/09
                                                       
import java.io.*;
class palindrome
{
  public static void main(String args[])throws Exception
   {
     int n,r,s,rev=0;
     DataInputStream ds=new DataInputStream(System.in);
     System.out.println("enter a number");
     n=Integer.parseInt(ds.readLine());
     s=n;
     while(n>0)
      {
        r=n%10;
        rev=(rev*10)+r;
        n=n/10;
      }
     if(s==rev)
        System.out.println("palindrome number");
     else
        System.out.println("not a palindrome number");
    }
}

