// package information

import java.util.Scanner;
class packageinfo
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println(sc.getClass());
	  //prints full package name.
	  System.out.println(sc.getClass().getName());
  }
}
