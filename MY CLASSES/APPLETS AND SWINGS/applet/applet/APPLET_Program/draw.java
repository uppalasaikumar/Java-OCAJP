import java.awt.*;
import java.applet.*;
public class draw extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.green);
g.drawLine(0,20,170,20);
g.setColor(Color.blue);      
g.drawLine(20,0,20,170);
g.setColor(Color.red);      
   
g.fillRect(30,60,60,60);
g.setColor(Color.gray);      
g.drawRoundRect(100,40,60,50,15,15);
g.setColor(Color.orange);      
g.fillRoundRect(30,140,60,40,15,15);
}
}
/*
<applet code ="draw" width = 200 height = 200>
</applet>
*/

