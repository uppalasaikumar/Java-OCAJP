// Program for implementing mini priority
import java.lang.*;
class minpri implements Runnable
   {
      public minpri()
        {
          Thread t1 = new Thread(this, "One");
          t1.start();
          Thread t2 = new Thread(this, "Two");
          t2.setPriority(Thread.MIN_PRIORITY);
          t2.start();
        }
     public void run()
       {
         try
           {
            for(int i = 1;i<5;i++)
             {
              System.out.println(Thread.currentThread()+" : " +i);
              Thread.sleep(250);
             }
            }catch(Exception e)
            {}
          }
         public static void main (String ar[])
          {
           try
             {
              new minpri();
             for(int i = 1;i<5;i++)
             {
              System.out.println(Thread.currentThread()+" : " +i);
              Thread.sleep(250);
             }
            }catch(Exception e)
            { System.out.println(e);
            }
          }
         }


