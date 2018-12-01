// Using super second method

class A
 {
  int i;
 }

 class B extends A
  {
   int i;
   B(int a, int b)
   {
   super.i=a;
   i=b;
   }
  void show()
   {
    System.out.println("i in superclass : " +super.i);
    System.out.println("i in subclass : " +i);
   }
  }

  class usesup
   {
    public static void main(String args[])
     {
      B b = new B(10,20);
      b.show();
    }
  }



