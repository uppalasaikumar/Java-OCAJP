
// Implementing java Threads-Intro
class A extends Thread
{
 public void run()
 {
  for(int i = 1; i<=4;i++)
   {
     System.out.println("\n From Thread A : i = "+i);
   }
     System.out.println("Exit From Thread A");
   }
  }

class B extends Thread
{
 public void run()
 {
  for(int j = 1; j<=4;j++)
   {
     System.out.println("\n From Thread B : j = "+j);
   }
     System.out.println("Exit From Thread B");
   }
  }

class C extends Thread
{
 public void run()
 {
  for(int k = 1; k<=4;k++)
   {
     System.out.println("\n From Thread C : k = "+k);
   }
     System.out.println("Exit From Thread C");
   }
  }

  class Thread3
  {
   public static void main(String aa[])
   {
    A tA = new A();
    B tB = new B();
    C tC = new C();

    tC.setPriority(Thread.MAX_PRIORITY);
    tB.setPriority(tB.getPriority()+1);
    tA.setPriority(Thread.MIN_PRIORITY);

    System.out.println("Start Thread A");
    tA.start();
    System.out.println("Start Thread B");
    tB.start();
    System.out.println("Start Thread C");
    tC.start();
    System.out.println("End of main thread");
   }

  }

