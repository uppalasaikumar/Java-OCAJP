// Ex 10a
class sync
{
        void display(String str)
        {
        System.out.println();
        try
         {
           System.out.println("~~~~~~~~~"+str);
           Thread.sleep(1000);
         }catch(Exception e)
          {
            System.out.println(e);
          }
            System.out.println("**********");
        }
}
public class ex10aa extends Thread
{
        sync sy;
        String str;
        public ex10aa(sync s1,String s2)
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
                ex10aa t1=new ex10aa(syn1,"Kapil");
                ex10aa t2=new ex10aa(syn1,"Azar");
                ex10aa t3=new ex10aa(syn1,"Suchin");
        }
}
                
                

                

                
