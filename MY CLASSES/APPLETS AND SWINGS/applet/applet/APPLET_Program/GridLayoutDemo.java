//gridLayout demo 

/*
Compiled from GridLayout.java
public class java.awt.GridLayout extends java.lang.Object implements java.awt.LayoutManager, java.io.Serializable {
    int hgap;
    int vgap;
    int rows;
    int cols;
    public java.awt.GridLayout();
    public java.awt.GridLayout(int,int);
    public java.awt.GridLayout(int,int,int,int);
    
*/

import java.awt.*;
import java.applet.* ;

//<applet code = "GridLayoutDemo.class" width ="200" height="100"></applet>

public class GridLayoutDemo extends Applet
   {
     
      public void init()
      {
        Button b1,b2,b3,b4;
        setLayout(new GridLayout(4,4));
        b1=new Button("Button ONE");
        b2=new Button("Button TWO");
        b3=new Button("Button THREE");
        b4=new Button("Button FOUR");
        add(b1);add(b2);add(b3);add(b4);

         GridLayoutDemo d=new GridLayoutDemo();
         d.setVisible(true);
       } 
     }


