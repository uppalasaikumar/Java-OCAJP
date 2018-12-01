//to design FlowLayout  
/*  public java.awt.FlowLayout();
    public java.awt.FlowLayout(int);
    public java.awt.FlowLayout(int,int,int);  */
import java.util.* ;
import java.applet.* ;
import java.awt.*;
//<applet code = "flow.class" width ="800" height="600"></applet>

 public class  flow extends Applet  {
     public void init() {
       String val="java is simple , " +
                  "awt in java is used " +
                  "to create GUI";
       setLayout(new FlowLayout());
       StringTokenizer str=new  StringTokenizer(val);
       while(str.hasMoreTokens())
       add(new Button(str.nextToken()));  }    }
-------------------------------------------------------
//To design BorderLayout  
   /* public java.awt.BorderLayout();
    public java.awt.BorderLayout(int,int) ;*/    
import java.applet.* ;
import java.awt.*;
//<applet code = "border.class" width ="800" height="600"></applet>
 public class  border extends Applet {
     public void init() {
       Button north,south,east,west,center;
       setLayout(new BorderLayout());

       north=new Button("NORTH");     south=new Button("SOUTH");
       east=new Button("EAST");       west=new Button("WEST");
       center=new Button("CENTER");   add(north,BorderLayout.NORTH);
       add(south,BorderLayout.SOUTH); add(east,BorderLayout.EAST);
       add(west,BorderLayout.WEST);   add(center,BorderLayout.CENTER);
      }  }                                 
_______________________________________________      
         
//to design gridLayout  
/*  public java.awt.GridLayout();
    public java.awt.GridLayout(int,int);
    public java.awt.GridLayout(int,int,int,int);  */ 
import java.awt.*;

import java.applet.* ;
//<applet code = "GridLayoutDemo.class" width ="200" height="100"></applet>
public class GridLayoutDemo extends Applet {
     public void init()  {
        Button b1,b2,b3,b4;
        setLayout(new GridLayout(4,4));
        b1=new Button("Button ONE");
        b2=new Button("Button TWO");
        b3=new Button("Button THREE");
        b4=new Button("Button FOUR");
        add(b1);add(b2);add(b3);add(b4);

        GridLayoutDemo d=new GridLayoutDemo();
        d.setVisible(true);  }    }
//in gridlayout all the buttons will be of same size
--------------------------------------------------------

     


