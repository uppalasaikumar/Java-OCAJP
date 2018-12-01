// Simple Inheritance
class A
  {
   int i,j;
   void showij()
    {
     System.out.println(i +" " +j);
    }
   }
 class B extends A
  {
   int k;
    void showk()
     {
      System.out.println("k " +k);
     }
   void sum()
    {
      System.out.println("i+j+k: "+(i+j+k));
     }
   }
  class siminh
   {
    public static void main(String args[])
     {
      A sup = new A();
      B sub = new B();

      sup.i = 10;
      sup.j = 20;
      System.out.println("Contents of super");
      sup.showij();
      System.out.println();
//      sub.i=7;
//      sub.j=8;
      sub.k=9;
      System.out.println("Contents of sub");
      sub.showij();
      sub.showk();
      System.out.println();
      System.out.println("Sum of i, j and k in sub");
      sub.sum();
     }
    }






