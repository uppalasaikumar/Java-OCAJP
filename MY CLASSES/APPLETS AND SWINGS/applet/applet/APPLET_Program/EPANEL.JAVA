
//to create a panel 

import java.awt.*;
// <applet code ="epanel" width = 400 height =400></applet>
public class epanel   extends Frame 
 {
 epanel()
 {
  Panel p1=new Panel();
 // Panel p2=new Panel();

  setBackground(new Color(5,5,5));
  p1.setBounds(12,81,50,50);
 // p2.setBounds(162,81,50,50);
  p1.setBackground(new Color(255,255,255));
//  p2.setBackground(new Color(180,0,0));

  add(p1);
 // add(p2);
  setVisible(true);

 }
 public static void main(String [] s)
 {
 epanel e=new epanel();
 }
}
