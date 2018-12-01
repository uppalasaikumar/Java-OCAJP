/*****************************************************************

  ROLL NUMBER: 07AT1A1210		DATE: 30-1-2009
  NAME: K.SREEKALA				EXERCISE NUMBER: 6(a)

  TITLE: DEVELOP AN APPLET THAT DISPLAYS A SIMPLE A MESSAGE

****************************************************************/

import java.awt.*;
import java.applet.Applet;

/*<applet code = "helloapplet" width=300, height=1000> <applet>*/

public class HelloApplet extends Applet
{
  public void paint(Graphics g)
  {
    g.drawString("hello how r u what r u doing",300,300);
  }
 }

 
