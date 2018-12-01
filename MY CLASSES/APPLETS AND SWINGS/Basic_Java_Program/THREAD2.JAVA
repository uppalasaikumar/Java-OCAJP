
// Implementing java Threads-Intro
class A extends Thread
{
 public void run()
 {
  for(int i = 1; i<=5;i++)
   {
     if (i==1) yield();
     System.out.println("\n From Thread A : i = "+i);
   }
     System.out.println("Exit From Thread A");
   }
  }

class B extends Thread
{
 public void run()
 {
  for(int j = 1; j<=5;j++)
   {
     System.out.println("\n From Thread B : j = "+j);
     if (j==3) stop();
   }
     System.out.println("Exit From Thread B");
   }
  }

class C extends Thread
{
 public void run()
 {
  for(int k = 1; k<=5;k++)
   {
     System.out.println("\n From Thread C : k = "+k);
     if (k==1)
     try
     {
      sleep(1000);
     }
     catch(Exception e)
     {
     }
   }
     System.out.println("Exit From Thread C");
   }
  }

  class Thread2
  {
   public static void main(String aa[])
   {
    A tA = new A();
    B tB = new B();
    C tC = new C();
    System.out.println("Start Thread A");
    tA.start();
    System.out.println("Start Thread B");
    tB.start();
    System.out.println("Start Thread C");
    tC.start();
    System.out.println("End of main thread");
   }

  }

