//program that demonstrates thread priorities
class threadp implements Runnable
{
Thread x;
long i=0;
boolean flag;
threadp(String name,int p)
{
x=new Thread(this);
x.setName(name);
x.setPriority(p);
}
void go()
{
flag=true;
x.start();
}
public void run()
{
while(flag==true)
{
i++;
}
}
void stop()
{
flag=false;
System.out.println(x.getName()+"'s priority="+x.getPriority()+" and it's i="+i);
}
}
class prioritydemo
{
public static void main(String args[])
{
threadp t1=new threadp("thread--1",1);
threadp t2=new threadp("thread--2",3);
threadp t3=new threadp("thread--3",5);
threadp t4=new threadp("thread--4",9);
Thread m=Thread.currentThread();
m.setPriority(10);
t1.go();
t2.go();
t3.go();
t4.go();
try
{
m.sleep(5000);
}catch(InterruptedException e){}
t1.stop();
t2.stop();
t3.stop();
t4.stop();
try
{
t1.x.join();
t2.x.join();
t3.x.join();
t4.x.join();
}catch(InterruptedException e){}
}
}
