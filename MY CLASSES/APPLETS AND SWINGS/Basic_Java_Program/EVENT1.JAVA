   
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.Applet;
 /* <applet code="event1.class" width=300 height=300>
   </applet> */
 public class event1 extends Applet implements ActionListener
{       String msg; Button b1,b2,b3;
        public void init()
        {
                b1=new Button("ONE");
                b2=new Button("TWO");
                b3=new Button("THREE");
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                add(b1); add(b2); add(b3);
        }
        public void actionPerformed(ActionEvent ae)
        {
          if(ae.getSource()==b1)
             msg = "ONE Pressed";
          if(ae.getSource()==b2)
            msg = "TWO Pressed";
          if(ae.getSource()==b3)
            msg = "THREE Pressed";
            repaint();
        }
        public void paint(Graphics g)
        {
                g.setColor(new Color(50,100,200));
                g.drawString(msg,100,100);
        }
}
