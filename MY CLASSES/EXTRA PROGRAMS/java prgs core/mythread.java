
/****************************************************************

  ROLL NUMBER: 07AT1A1219			DATE: 13-2-2009
								EXERCISE NUMBER: 9(a)
  
  TITLE: WRITE A PROGRAM THAT CREATES THE THREADS. FIRST THREAD DISPLAYS “GOOD MORNING” EVERY ONE SECOND THE SECOND THREAD DISPLAYS “HELLO” FOR EVERY TWO SECONDS AND THE THIRD THREAD DISPLAYS “WELCOME” FOR EVERY THREE SECONDS.

*****************************************************************/

import java.io.*;
public class mythread extends Thread
{
  public void run()
  {
    try
    {
       String msg=getName();
       if(msg.compareTo("Thread-0")>0)
            System.out.println("Good morning");
       if(msg.compareTo("Thread-1")>0)
            System.out.println("Hello");
       if(msg.compareTo("Thread-2")>0)
            System.out.println("Welcome");
            System.out.println(msg);
    }
    catch(Exception e)
    {

    }
  }
  




public static void main(String org[])throws Exception
  {
    try
    {
      mythread t1=new mythread();
        t1.start();
      mythread t2=new mythread();
        t2.start();
      mythread t3=new mythread();
        t3.start();
    }
    catch(Exception e)
    {

    }
  }
}

/**********************************************************

                  INPUT/OUTPUT

**********************************************************/

/*C: \anusha>java mythread
Thread-0
Good morning
Good morning
Thread-1
Hello
Thread-2 */
