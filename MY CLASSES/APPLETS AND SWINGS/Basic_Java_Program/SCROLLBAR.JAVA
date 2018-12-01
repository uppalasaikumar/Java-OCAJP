//to create a scroll bar 
/* Compiled from Scrollbar.java
   public class java.awt.Scrollbar extends
    java.awt.Component implements java.awt.Adjustable {
    public static final int HORIZONTAL;
    public static final int VERTICAL;

    public java.awt.Scrollbar();
    public java.awt.Scrollbar(int);
    public java.awt.Scrollbar(int,int,int,int,int);  */

//<applet code = "scrollbar.class" width ="400" height="400"></applet>

import java.awt.* ;
import java.applet.* ;
public class scrollbar extends Applet {
  public void init()  {
    Scrollbar  sb=new Scrollbar();  //creates vertical scrollbar
    Scrollbar  h=new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar  horsb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,200);
    Scrollbar  versb=new Scrollbar(Scrollbar.VERTICAL,0,1,0,200);

                            //(style,initial value,thumbsize,min,max)
                            //min and max for month is 1-12
                            //min and max for colours is 1-256

    add(sb);  add(h);  add(horsb);  add(versb);
  }
}
