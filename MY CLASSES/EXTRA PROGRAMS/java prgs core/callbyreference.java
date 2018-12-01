class test
{
  int a,b;
  test(int i,int j)
   {
     a=i;
     b=j;
   }
  void meth(test o)
   {
     o.a*=2; // o.a = o.a * 2;
     o.b/=2; // o.b = o.b / 2;
   }
}
class callbyreference
{
  public static void main(String args[])
   {
     test ob=new test(15,20);
     System.out.println("a and b before call "+ob.a+"  "+ob.b);
     ob.meth(ob);
     System.out.println(" a and b after call "+ob.a+"  "+ob.b);
   }
}
