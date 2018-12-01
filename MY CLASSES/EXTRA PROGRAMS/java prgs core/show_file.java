

import java.io.*;
class show_file
{
  public static void main(String args[])throws IOException
  {
   
      int i;
    try
     {
      FileInputStream Fin;
      Fin=new FileInputStream(args[0]);
    do
    {
      i=Fin.read();
      if(i!=-1)
        System.out.print((char)i);
    }while(i!=-1);
    Fin.close();
  }
   catch(FileNotFoundException e)
    {
      System.out.println("file not found");
    }  
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("usage:show file");
     }
}
}

/******************************************************
			INPUT / OUTPUT
*******************************************************/
/*  usage:showfile

*******************************************************/
