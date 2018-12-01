import java.io.*;
class strpalin
{
  public static void main(String args[])throws Exception
   {
     string str;
     System.out.println("PROGRAM TO FIND WHETHER THE GIVEN STRING IS PALINDROME OR NOT");
     DataInputStream ds=new DataInputStream(System.in);
     System.out.println("enter a string");
     str=ds.readLine();
     ispalindrome();
   }
