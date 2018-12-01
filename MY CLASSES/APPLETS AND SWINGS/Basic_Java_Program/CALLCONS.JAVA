// When & how constructors called

class A
 {
   A()
    {
     System.out.println("Inside A's constructors.");
    }
  }

class B extends A
 {
   B()
    {
     System.out.println("Inside B's constructors.");
    }
  }

class C extends B
 {
   C()
    {
     System.out.println("Inside C's constructors.");
    }
  }

class callcons
 {
  public static void main(String args[])
   {
    C c = new C();
   }
  }


