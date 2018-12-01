//program that demonstrates concurrent execution 
//of Threads and sleep() and join()
class thread1 implements Runnable
{
Thread x;int d;
thread1(String name,int delay)
{
x=new Thread(this);
x.setName(name);
d=delay;
x.start();
}
public void run()
{
try
{
System.out.println(x.getName()+" started");
for(int i=1;i<=3;i++)
{
System.out.println(x.getName()+"'s i="+i);
x.sleep(d);
}
}catch(InterruptedException e){}
System.out.println(x.getName()+" exited");
}
}
class threaddemo2
{
public static void main(String args[])
{
System.out.println(">>>main started<<<");
thread1 t1=new thread1("Thread--1",2000);
thread1 t2=new thread1("Thread--2",2500);
thread1 t3=new thread1("Thread--3",3000);
try
{
t1.x.join();
t2.x.join();
t3.x.join();
}catch(InterruptedException e){}
System.out.println(">>>main exited<<<");
}
}
