// TO CREATE FRAME
/*  public java.awt.Frame();
    public java.awt.Frame(java.lang.String);  */

import java.awt.* ;
public class frm
{
 public static void main(String [] s)
 {
  Frame f=new Frame("frame in java");
  f.resize(100,100);
  f.setBackground(Color.blue);
  f.setVisible(false);   //or f.show() ;
 }
}
//to run c:>java frm
