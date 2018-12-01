/*
    public java.awt.BorderLayout();
    public java.awt.BorderLayout(int,int);
*/      

import java.applet.* ;
import java.awt.*;
//<applet code = "border.class" width ="800" height="600"></applet>

 public class  border extends Applet
   {

     public void init()
     {
       Button north,south,east,west,center;

       setLayout(new BorderLayout());
       north=new Button("NORTH");
       south=new Button("SOUTH");
       east=new Button("EAST");
       west=new Button("WEST");
       center=new Button("CENTER");

       add(north,BorderLayout.NORTH);
       add(south,BorderLayout.SOUTH);
       add(east,BorderLayout.EAST);
       add(west,BorderLayout.WEST);  
       add(center,BorderLayout.CENTER);
      }                                  
 }        
             
     

