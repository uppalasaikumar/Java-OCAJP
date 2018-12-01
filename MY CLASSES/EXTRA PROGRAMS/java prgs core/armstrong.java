import java.io.*;
class armstrong
{
  public static void main(String args[])throws Exception
   {
     int n,r,temp,s=0;
     DataInputStream ds=new DataInputStream(System.in);
     System.out.println("enter a number");
     n=Integer.parseInt(ds.readLine());
     temp=n;
     while(temp>0)
      {
        r=temp%10;
        s=s+r*r*r;
        temp=temp/10;
      }
    if(n==s)
       System.out.println("armstrong number");
    else
       System.out.println("not armstrong number");
   }
}

