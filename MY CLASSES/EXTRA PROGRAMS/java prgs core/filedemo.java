/


import java.io.*;
class filedemo
 {
    static void p(String s)
    {
      System.out.println(s);
    }
    public static void main(String args[])
    {

      File f1=new File("/java/copyright");
      p("file name="+f1.getName());
      p("path="+f1.getPath());
      p("abspath="+f1.getAbsolutePath());
      p("parent="+f1.getParent());
      p(f1.exists()?"exists":"does not exists");
      p(f1.canWrite()?"is writable":"is not writable");
      p(f1.canRead()?"is readible":"is not readible");
      p(f1.isFile()?"is normal file":"it might be a named pipe");
      p(f1.isAbsolute()?"is absolute":"is not absolute");
      p("file last modified"+f1.lastModified());
      p("file size"+f1.length()+"bytes");
    }
 }






/****************************************************************
				INPUT / OUTPUT
****************************************************************/

/*  C:\susmitha>java filedemo
    file name=copyright
    path=\java\copyright
    abspath=C:\java\copyright
    parent=\java
    does not exists
    is not writable
    is not readible
    it might be a named pipe
    is not absolute
    file last modified0
    file size0bytes

***************************************************************/

