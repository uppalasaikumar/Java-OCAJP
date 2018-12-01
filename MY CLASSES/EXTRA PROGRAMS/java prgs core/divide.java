public class divide
{
  public static void main(String args[])
  {
    System.out.println("program execution starts here");
    int a,b,c;
    try
    {
     a=Integer.parseInt(args[0]);
     b=Integer.parseInt(args[1]);
     c=a/b;
     System.out.println(a+"/"+b+"="+c);
    }
    catch(NumberFormatException e)
    {
      System.out.println("arguments passed should be valid numbers");
    }
    catch(ArithmeticException e)
    {
      System.out.println("second argument should not be zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("pass proper arguments");
    }
    System.out.println("the program execution completes here");
  }
}

