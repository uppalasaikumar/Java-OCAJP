import java.awt.*;
import java.applet.*;

public class userin extends Applet
 {
  TextField  tx1, tx2;

  public void init()
   {
    tx1 = new TextField(8);
    tx2 = new TextField(8);
    add(tx1);
    add(tx2);
    tx1.setText("0");
    tx2.setText("0");
  }

 public void paint (Graphics g)
 {
  int x = 0, y=0, z=0;
  String s1,s2,s;
  g.drawString ("Input a number in each box  ", 10, 50);
  try
    {
     s1= tx1.getText();
     x = Integer.parseInt(s1);
     s2= tx1.getText();
     y = Integer.parseInt(s2);
    }
  catch(Exception ex)
  {
  }
  z = x+y;
  s = String.valueOf(z);
  g.drawString("The sum is :  ", 10,75);
  g.drawString(s,100,75);
 }
 public boolean action(Event event , Object obj)
  {
    repaint();
    return true;
  }
 }

