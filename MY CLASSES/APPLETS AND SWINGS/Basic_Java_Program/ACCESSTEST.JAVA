/* This Program demonstrates the difference between
public and private */

class test
 {
   int a;              // Default access
   public int b;       // Public access
   private int c;      // Private access

   // Methods to acces c
      void setc(int i)
      {  c = i;  }     // Set c's value
      
      int getc()
      {  return c; }   // Ger c's value


  }

class AccessTest
{
  public static void main(String args[])
  {
   test ob = new test();

   // These are OK, and ab may be accessed directly
      ob.a = 10;
      ob.b = 20;

   // This is not OK and will cause error!
   // ob.c = 100; //Error!

   // You must access c through its methods
      ob.setc(100); //OK

      System.out.println("a,b and c:" + ob.a + " " + ob.b + " " + ob.getc());
   }
}

