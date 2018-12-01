// Program for set and get name from thread

import java.lang.*;
class thrd2
  {
    public static void main(String ar[])
     {
       Thread t1 = new Thread();
       System.out.println(t1.toString());
       t1.setName("Thread1");
       System.out.println(t1.getName());
     }
  }


