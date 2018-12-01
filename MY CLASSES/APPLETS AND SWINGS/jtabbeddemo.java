//program that demonstrates JTabbedPane
import javax.swing.*;
import java.awt.*;
public class jtabbeddemo extends JApplet
{
public void init()
{
JPanel jp1=new JPanel();
JCheckBox red=new JCheckBox("Red");
red.setBackground(Color.red);
JCheckBox yellow=new JCheckBox("Yellow");
yellow.setBackground(Color.yellow);
JCheckBox blue=new JCheckBox("Blue");
blue.setBackground(Color.blue);
jp1.add(red);
jp1.add(yellow);
jp1.add(blue);
JPanel jp2=new JPanel();
JRadioButton chennai=new JRadioButton("Chennai");
JRadioButton hyd=new JRadioButton("Hyderabad");
JRadioButton banglore=new JRadioButton("Banglore");
ButtonGroup b1 = new ButtonGroup();
jp2.add(chennai);
jp2.add(hyd);
jp2.add(banglore);
b1.add(chennai);
b1.add(hyd);
b1.add(banglore);
JPanel jp3=new JPanel();
JComboBox bikes=new JComboBox();
bikes.addItem("Discover");
bikes.addItem("Pulsar");
bikes.addItem("Boxer");
bikes.addItem("Wind 125");
bikes.addItem("Caliber 115");
bikes.setBackground(Color.pink);
jp3.add(bikes);
JTabbedPane jtp=new JTabbedPane();
jtp.add(jp1,"COLORS");
jtp.add(jp2,"CITIES");
jtp.add(jp3,"BIKES");
Container cp=getContentPane();
cp.add(jtp);
}
}
/*<applet code="jtabbeddemo" width="500" height="500">
</applet>*/
