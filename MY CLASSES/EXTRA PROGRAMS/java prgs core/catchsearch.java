class catchsearch
{
  public static void main(String args[])
   {
     try
      {
        System.out.println("before calling a()");
        a();
        System.out.println("after calling a()");
      }
      catch(Exception e)
      {
        System.out.println("main:"+e);
      }
      finally
      {
        System.out.println("main:final block");
      }
   }
  static void a()
  {
    try
    {
      System.out.println("before calling b()");
      b();
      System.out.println("after calling b()");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("some error in array index usage check");
    }
    finally
    {
      System.out.println("a():final block");
    }
  }
 static void b()
  {
    try
    {
      int array[]=new int[4];
      array[10]=10;
    }
    catch(ClassCastException e)
    {
      System.out.println("b="+e);
    }
    finally
    {
      System.out.println("b():finally block");
    }
  }

}

