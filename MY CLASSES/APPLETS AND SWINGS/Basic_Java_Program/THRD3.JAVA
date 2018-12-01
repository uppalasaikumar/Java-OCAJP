// Program for simple threads

import java.lang.*;
class thrd3 implements Runnable
 {
  public thrd3()
    {
      Thread t1 = new Thread(this, "one");
      t1.start();
    }
  public void run()
    {
      try
        {
        for (int i = 1 ; i < 5 ; i++)
         {
         System.out.println(Thread.currentThread()+ " : " +i);
         Thread.sleep(500);
        }
      } catch(Exception e)
       {
        }
    }
   public static void main(String ar[])
    {
      try
       {
        new thrd3();
        for (int i = 1 ; i < 5 ; i++)
         {
         System.out.println(Thread.currentThread()+ " : " +i);
         Thread.sleep(1000);
        }
      } catch(Exception e)
       {
        System.out.println (e);
        }
    }
  }

