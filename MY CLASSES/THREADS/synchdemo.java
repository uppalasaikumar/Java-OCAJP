//program that demonstrates synchronization of threads
class table
{
synchronized void showtable(int n)
{
System.out.println(n+" table started");
for(int i=1;i<=10;i++)
System.out.println(n+"*"+i+"="+(n*i));
System.out.println(n+" table completed");
}
}
class tablegenerator implements Runnable
{
table tbl;
int tno;
Thread x;
tablegenerator(table tb,int no)
{
x=new Thread(this);
tno=no;
tbl=tb;
x.start();
}
public void run()
{
tbl.showtable(tno);
}
}
class synchdemo
{
public static void main(String args[])
{
table tbl=new table();
tablegenerator tg1=new tablegenerator(tbl,2);
tablegenerator tg2=new tablegenerator(tbl,3);
tablegenerator tg3=new tablegenerator(tbl,5);
try
{
tg1.x.join();
tg2.x.join();
tg3.x.join();
}catch(InterruptedException e){}
}
}
