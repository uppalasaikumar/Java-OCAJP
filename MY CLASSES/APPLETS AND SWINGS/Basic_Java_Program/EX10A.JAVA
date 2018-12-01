// Ex 10a
class sync
{
        synchronized void display(String str)
        {
        System.out.println();
        try
         {
           System.out.print("~~~~~~~~~"+str);
           Thread.sleep(1000);
         }catch(Exception e)
          {
            System.out.println(e);
          }
            System.out.println("**********");
        }
}
public class ex10a extends Thread
{
        sync sy;
        String str;
        public ex10a(sync s1,String s2)
        {
                sy=s1;
                str=s2;
                start();
        }
        public void run()
        {
                sy.display(str);
        }
        public static void main(String ar[])throws InterruptedException
        {
                sync syn1=new sync();
                ex10a t1=new ex10a(syn1,"Kapil");
                ex10a t2=new ex10a(syn1,"Azar");
                ex10a t3=new ex10a(syn1,"Suchin");
        }
}
                
                

                

                
