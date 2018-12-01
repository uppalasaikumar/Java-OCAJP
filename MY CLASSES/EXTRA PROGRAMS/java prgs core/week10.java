/*****************************************************************
  
  ROLL NUMBER: 07AT1A1209			DATE: 13-2-2009
 
 NAME: K.N.K.SAKILA				EXERCISE NUMBER: 10

*****************************************************************/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="week10" width=380 height=380>
  </applet>*/
public class week10 extends Applet implements ActionListener
{
  String msg="";
  TextField t1,t2,t3;
  Button b1;
  public void init()
  {
    Label n1=new Label("enter a first number",Label.RIGHT);
    Label n2=new Label("enter a second number",Label.RIGHT);
    Label n3=new Label("division of two numbers",Label.RIGHT);
    t1=new TextField(20);
    t2=new TextField(20);
    t3=new TextField(20);
    b1=new Button("division");
    add(n1);
    add(t1);
    add(n2);
    add(t2);
    add(n3);
    add(t3);
    add(b1);
    b1.addActionListener(this);
   }
   





public void actionPerformed(ActionEvent e)
   {
     int div=0,n1,n2;
     String str;
     try
     {
       n1=Integer.parseInt(t1.getText());
       n2=Integer.parseInt(t2.getText());
       div=n1/n2;
       StringBuffer sb=new StringBuffer(40);
       str=sb.append(" ").append(div).toString();
       t3.setText(str);
     }
     catch(Exception g)
     {
       t3.setText("number format exception");
     }
   }
   public void paint(Graphics g)
   {
     setBackground(Color.pink);
   }
}

