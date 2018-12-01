 // PROGRAM FOR SHAPES USING APPLETS GRAPHICS.

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code= "shapes.class" width="300" height="300"> </applet>
 
public class shapes extends Applet {

 public void init()
  {
     repaint();
  }

public void paint(Graphics g){

 /* Circle inside a square */

 g.drawOval(25,75,40,40);
 g.drawRect(20,70,50,50);

/* square inside a circle */

g.drawOval(80,70,50,50);
g.drawRect(90,80,30,30);

/*Cube */
g.drawRect(50,150,70,70);
g.drawRect(20,180,70,70);
g.drawLine(20,180,50,150);
g.drawLine(20+70,180,50+70,150);
g.drawLine(20,180+70,50,150+70);
g.drawLine(20+70,180+70,50+70,150+70);

/* cone */

g.drawOval(150,75,50,20);
g.drawLine(150,85,175,125);
g.drawLine(175,125,200,85);

/* cylinder */

g.drawOval(160,160,50,20);
g.drawOval(160,220,50,20);
g.drawLine(160,170,160,230);
g.drawLine(210,170,210,230);

}
}
