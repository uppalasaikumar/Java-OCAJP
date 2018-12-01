class file demo
 {
    Static void println(String s)
    {
      System.out.println(s);
    }
    public static void main(String args[])
    {
      File f1=new File("/java/copy right");
      p("file name="+f1.getname());
      p("path="+f1.getpath());
      p("abspath="+f1.getabsolutepath());
      p("parent="+f1.getparent());
      p(f1.exists()?"exists":"does not exists");
      p(f1.canwrite()?"is writable":"is not writable");
      p(f1.canread()?"is readible":"is not readible");
      p(f1.isFile()?"is normal file":"it might be a named pipe");
      p(f1.isAbsolute()?"is absolute":"is not absolute");
      p("file last modified"+f1.lastmodified());
      p("file size"+f1.length()+"bytes");
    }
 }

