   
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.Applet;
 /* <applet code="ex9a.class" width=300 height=300>
   </applet> */
 public class ex9a extends Applet implements Runnable,ActionListener
{       Thread t1; String msg; Button b1,b2,b3,b4; int x=10,y=10;
        public void init()
        {       msg="Hai! Welcome to Applet";
                t1=new Thread(this,"one");
                b1=new Button("Start");
                b2=new Button("Suspend");
                b3=new Button("Resume");
                b4=new Button("Stop");
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                add(b1); add(b2); add(b3); add(b4);
        }
        public void actionPerformed(ActionEvent ae)
        {
          if(ae.getSource()==b1) {  t1.start(); }
          else if(ae.getSource()==b2) { t1.suspend();}
          else if(ae.getSource()==b3){ t1.resume(); }
          else if(ae.getSource()==b4){ t1.stop(); }
        }
        public void run()
        {
         try { while(true) {
                if(x>700) {  x=10; }
                repaint();
                Thread.sleep(1000);                            
              } }
              catch(Exception e) { e.printStackTrace(); }
        }
        public void paint(Graphics g)
        {
                g.setColor(new Color(128,218,97));
                y=250;
                g.drawString(msg,x+=10,y);
        }
}
