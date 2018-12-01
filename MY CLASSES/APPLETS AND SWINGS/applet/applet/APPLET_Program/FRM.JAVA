// TO CREATE FRAME
 /* public java.awt.Frame();
  public java.awt.Frame(java.lang.String); */

import java.awt.* ;
import java.applet.*;
// <applet code ="frm" width = 400 height = 400></applet>
public class frm
{
 public static void main(String [] s)
 {
  Frame f=new Frame("frame in java");
  f.resize(100,100);
  f.setBackground(Color.red);
  f.setVisible(true);   //or f.show() ;
 }
}
//to run c:>java frm
