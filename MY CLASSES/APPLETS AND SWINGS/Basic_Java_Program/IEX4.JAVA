
//Image manipulation.

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class iex4 extends Applet 
{
        Image img;
        public void init()
        {
                img=getImage(getCodeBase(),getParameter("img"));
        }
        public void paint(Graphics g)
        {
                g.drawImage(img,0,0,this);
        }
}

