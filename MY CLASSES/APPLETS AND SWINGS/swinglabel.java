//program that demonstrates swings components
import javax.swing.*;
import java.awt.*;
public class swinglabel extends JApplet
{
public void init()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
ImageIcon icon=new ImageIcon("47.jpg");
JLabel label=new JLabel(icon,JLabel.CENTER);
cp.add(label);
}
}
/*<applet code="swinglabel" width="100" height="100">
</applet>*/
