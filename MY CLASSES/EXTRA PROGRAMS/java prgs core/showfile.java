

import java.io.*;
class showfile
{
  public static void main(String args[])throws IOException
  {
    int i;
    FileInputStream Fin;
    try
    {
      Fin=new FileInputStream(args[0]);
    }
    catch(FileNotFoundException e)
    {
      System.out.println("file not found");
      return;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("usage:show file");
      return;
    }
    do
    {
      i=Fin.read();
      if(i!=1)
        System.out.println((char)i);
    }while(i!=-1);
    Fin.close();
  }
}

/*********************************************************
			INPUT / OUTPUT
**********************************************************/

/*  C:\pinky>javac show_file.java

C:\pinky>java show_file welcome.java
class welcome
{
  public static void main(String args[])
  {
    System.out.print("WELCOME TO THE OOP'S LABORATORY");
  }
}


************************************************************/
