//to create a panel 

import java.awt.*;

public class panel  
 {
  
 public static void main(String [] s)
 {
  Frame f=new Frame("FRAME WITH PANEL");
  Panel p1=new Panel();
  Panel p2=new Panel();
  /*
  f.setBounds(0,0,300,300);
  p1.setBounds(12,81,50,50);
  p2.setBounds(162,81,50,50);
  */

  f.resize(400,400);
  f.setBackground(Color.red);
  p1.resize(50,50);
  p1.setBackground(new Color(255,255,255));

  p2.resize(50,50);
  p2.setBackground(new Color(5,5,5));

  
  f.add(p1);
  f.add(p2);
  f.show();

 }

}
