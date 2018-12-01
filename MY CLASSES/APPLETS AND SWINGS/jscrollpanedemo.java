//program that demonstrates JScrollPane
import javax.swing.*;
import java.awt.*;
public class jscrollpanedemo extends JApplet
{
public void init()
{
Container cp=getContentPane();
cp.setLayout(new BorderLayout());
JPanel jp=new JPanel();
jp.setLayout(new GridLayout(30,10));
for(int i=1;i<=300;i++)
jp.add(new Button("Button"+i));
int x=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int y=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
JScrollPane jsp=new JScrollPane(jp,x,y);
cp.add(jsp,"Center");
}
}
/*<applet code="jscrollpanedemo" width="500" height="500">
</applet>*/
