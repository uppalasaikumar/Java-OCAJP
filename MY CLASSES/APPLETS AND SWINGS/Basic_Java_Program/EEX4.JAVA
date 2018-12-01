
//Implementation of Point class for image manipulation.

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class eex4 extends Applet
{
        Point p;
        Image i1;
        public void init()
        {
//              setLayout(new FlowLayout());
                p=new Point();
                p.setLocation(0,0);      
                i1=getImage(getCodeBase(),"vs.jpg");
                repaint();
        }
        public void paint(Graphics g)
        {
                int x=(int)p.getX();
                int y=(int)p.getY();
                g.drawImage(i1,x,y,this);
                g.drawString("SVCE",100,200);
        }
}

