//program that dispalys Thread information
class threadinfo implements Runnable
{
Thread x;  //object reference for predefined thread 
//class is created
threadinfo(String str,int p)//one - param threadinfo class 
//constructor is created
{
x = new Thread(this); //object of thread class is created
x.start();
x.setName(str);
x.setPriority(p);
}
public void run()
{
System.out.println(x);
}
}
class threaddemo1
{
public static void main(String args[])
{
threadinfo t1=new threadinfo("Thread--1",6);
threadinfo t2=new threadinfo("Thread--2",3);
threadinfo t3=new threadinfo("Thread--3",8);

}
}