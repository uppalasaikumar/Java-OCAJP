import java.awt.*;
import java.applet.*;

public class app6 extends Applet
 {
  public void paint(Graphics g)
   {
    int n1 = 10;
    int n2 = 15;
    int tot = n1 + n2;
    String s = "Total = " + String.valueOf(tot);
    g.drawString(s, 100, 100);
   }
 }

