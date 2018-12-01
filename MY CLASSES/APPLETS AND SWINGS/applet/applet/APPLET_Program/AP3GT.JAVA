//        PROGRAM TO PRINT THE GREATEST USING APPLET  

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*<applet code=ap3gt width=400 height=300></applet>*/

public class ap3gt extends Applet implements ActionListener
{
        Label l1,l2,l3; TextField t1,t2,t3;  TextArea ta;
        Button b1,b2;   int x,y,z;

        public void init()
        {
          setLayout(null);
          l1=new Label("First Number"); l2=new Label("Second Number");
          l3=new Label("Third Number");
          b1=new Button("Click Me For Result"); b2=new Button("Clear");
          t1=new TextField(); t2=new TextField(); t3=new TextField();
          ta=new TextArea();
          b1.addActionListener(this);  b2.addActionListener(this);
          l1.setBounds(40,40,130,20);  t1.setBounds(200,40,130,20);
          l2.setBounds(40,80,130,20);  t2.setBounds(200,80,130,20);
          l3.setBounds(40,120,130,20); t3.setBounds(200,120,130,20);
          b1.setBounds(40,180,150,20); b2.setBounds(220,180,70,20);
          ta.setBounds(60,240,250,90);
          add(l1);add(l2);add(l3);add(t1);add(t2);add(t3);
          add(b1);add(b2);add(ta);
          }
       public void actionPerformed(ActionEvent ae)
        {
          if(ae.getSource()==b1)
          {
                  ta.setText("");
                  x=Integer.parseInt(t1.getText());
                  y=Integer.parseInt(t2.getText());
                  z=Integer.parseInt(t3.getText());
                  if(x>y) { if(x>z) {
                            ta.append(x+" is the biggest Number"); }
                            else {
                           ta.append(z+" is the biggest Number"); } }
                   else { if(y>z) { ta.append(y+" is the biggest Number"); }
                   else { ta.append(z+" is the biggest Number"); } } }
          else if(ae.getSource()==b2)
          {
                  t1.setText("");
                  t2.setText("");
                  t3.setText("");
          }
  }
}
