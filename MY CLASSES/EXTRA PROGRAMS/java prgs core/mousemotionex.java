/*****************************************************************

  ROLL NUMBER: 07AT1A1215			DATE: 13-2-2009
  								EXERCISE NUMBER: 8

  TITLE: WRITE A PROGRAM FOR HANDLING MOUSE EVENTS.

*****************************************************************/

import java.awt.*;
import java.awt.event.*;
class mousemotionex extends Frame implements MouseMotionListener
{
  int xnew,ynew,xold,yold;
  boolean start=true;
  mousemotionex()
  {
    addMouseMotionListener(this);
    addMouseListener(new MouseAdapter()
    {
      public void mouseRelease(MouseEvent me)
       {
         start=true;
       }
    });
  }
 public void mouseDragged(MouseEvent me)
 {
   xnew=me.getX();
   ynew=me.getY();
   if(start)
   {
     start=false;
     xold=xnew;
     yold=ynew;
   }
   repaint();
 }



 public void update(Graphics g)
 {
   g.drawLine(xold,yold,xnew,ynew);
   xold=xnew;
   yold=ynew;
 }
 public void mouseMoved(MouseEvent me)
 {

 }
 public static void main(String org[])
 {
   mousemotionex mm=new mousemotionex();
   Toolkit tk=Toolkit.getDefaultToolkit();
   mm.setSize(tk.getScreenSize());
   mm.setVisible(true);
 }
}


