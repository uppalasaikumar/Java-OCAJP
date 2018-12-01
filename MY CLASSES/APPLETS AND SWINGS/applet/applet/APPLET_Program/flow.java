//FlowLayout demo 
/*
    public java.awt.FlowLayout();
    public java.awt.FlowLayout(int);
    public java.awt.FlowLayout(int,int,int);

*/

import java.util.* ;
import java.applet.* ;
import java.awt.*;
//<applet code = "flow.class" width ="800" height="600"></applet>

 public class  flow extends Applet
   {

     public void init()
     {
       String val="java is simple , " +
                  "awt in java is used " +
                  "to create GUI";
       setLayout(new FlowLayout());
       StringTokenizer str=new  StringTokenizer(val);
       while(str.hasMoreTokens())
       add(new Button(str.nextToken()));

      }
           
}             
     

