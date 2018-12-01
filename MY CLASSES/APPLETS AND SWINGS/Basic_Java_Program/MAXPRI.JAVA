// Program for implementing max priority
import java.lang.*;
class maxpri implements Runnable
   {
      public maxpri()
        {
          Thread t1 = new Thread(this, "One");
          t1.start();
          Thread t2 = new Thread(this, "Two");
          t2.setPriority(Thread.MAX_PRIORITY);
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
              new maxpri();
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


