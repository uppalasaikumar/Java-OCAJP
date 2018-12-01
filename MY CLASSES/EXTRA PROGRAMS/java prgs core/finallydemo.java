class finallydemo
{
  static void proca()
  {
    try
    {
      System.out.println("inside proca");
      throw new RuntimeException("demo");
    }
    finally
    {
      System.out.println("proca's finally");
    }
  }
  static void procb()
  {
    try
    {
      System.out.println("inside procb");
      return;
    }
    finally
    {
      System.out.println("procb's finally");
    }
  }
  static void procc()
  {
    try
    {
      System.out.println("inside procc");
    }
    finally
    {
      System.out.println("procc's finally");
    }
  }
  public static void main(String args[])
  {
    try
    {
      proca();
    }
    catch(Exception e)
    {
      System.out.println("exception caught");
    }
    procb();
    procc();
  }
}

